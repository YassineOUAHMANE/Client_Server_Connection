import java.io.*;
import java.net.*;
import java.util.Random;

public class ServeurProverbe {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        PrintWriter out = null;

        // Liste des proverbes
        String[] proverbes = {
                "La vie est un mystère qu'il faut vivre, et non un problème à résoudre.",
                "Le bonheur est parfois caché dans l'inconnu.",
                "Le bonheur n'est pas une destination, mais une façon de voyager.",
                "Le bonheur est la seule chose qui se double si on le partage.",
                "Le bonheur est un parfum que l'on ne peut répandre sur autrui sans en faire rejaillir quelques gouttes sur soi-même.",
                "Le bonheur est un état d'esprit.",
                "Le bonheur est un papillon qui, lorsqu'il est poursuivi, est toujours juste hors de portée, mais qui, si vous vous asseyez tranquillement, peut se poser sur vous.",
                "Le bonheur est un choix.",
                "Le bonheur est un voyage, pas une destination."
        };

        try {
            // Création du serveur sur le port 1234
            serverSocket = new ServerSocket(1234);
            System.out.println("Serveur en attente de connexions...");

            while (true) {
                // Acceptation de la connexion du client
                clientSocket = serverSocket.accept();
                System.out.println("Client connecté : " + clientSocket.getInetAddress());

                // Envoi d'un proverbe aléatoire
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                String proverbe = proverbes[new Random().nextInt(proverbes.length)];
                out.println("Proverbe du jour : " + proverbe);

                // Fermeture de la connexion avec le client
                out.close();
                clientSocket.close();
                System.out.println("Proverbe envoyé et client déconnecté.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
