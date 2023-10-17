package serverPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main (String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(2020);
        System.out.println("Je suis un server en attente la connexion d'un client");
        Socket s = ss.accept();
        System.out.println("un client est connecté");

        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        
        //c.  Le serveur, qui était en attente de ce nombre, le reçoit
        int nb = is.read();
        //d. Le serveur calcule le produit x*5

        int res = nb*5;
        //e. Le serveur envoie le résultat au client
        os.write(res);

        s.close();
        ss.close();
    }
}