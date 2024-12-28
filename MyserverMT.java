import java.io.*;
import java.net.*;

public class MyserverMT extends Thread {
    private int Clientnumber;
    public static void main(String[] args) {
        new MyserverMT().start();
      }
      @Override
      public void run(){
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Démarrage de serveur...");
           while(true) { 
             Socket socket = ss.accept();
             ++Clientnumber;
             new Conversation(socket,Clientnumber).start();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
      class Conversation extends Thread {
        private Socket socket;
        private int Clientnumber;
        public Conversation(Socket s,int num){
            this.socket = s;
            this.Clientnumber = num;
        }
        @Override
        public void run(){
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader bfr = new BufferedReader(isr);
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os,true);
                String IP = socket.getRemoteSocketAddress().toString();
                System.out.println("Le client numero "+Clientnumber+ " est connecté");
                pw.println("Bienvenue vous êtes le client numero : "+Clientnumber);
                while (true){
                    String req = bfr.readLine();
                    System.out.println("Le client "+IP+"a envoyé la requete suivante :"+req);
                    pw.println(req.length());
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

      }
}