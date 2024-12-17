import java.io.*;
import java.net.*;

public class ClientProverbe {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;

        try {
            // Connexion au serveur sur localhost, port 1234
            socket = new Socket("localhost", 1234);
            System.out.println("Connecté au serveur.");

            // Réception du proverbe
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = in.readLine();
            System.out.println("Message reçu du serveur : " + message);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
