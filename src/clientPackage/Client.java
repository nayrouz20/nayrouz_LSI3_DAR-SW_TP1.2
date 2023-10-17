package clientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	  public static void main (String[] args) throws IOException{
	        System.out.println("Je suis un client pas encore connecté");
	        Socket s = new Socket("localhost",2020);
	        System.out.println("Je suis un client connecté");

	        InputStream is = s.getInputStream();
	        OutputStream os = s.getOutputStream();
	        //a. le client est demandé de taper un entier x au clavier
	        Scanner sc = new Scanner(System.in);
	        int nb = sc.nextInt();
	        //b. le client envoie cet entier au serveur 
	        os.write(nb);
	        //c. le client recoit le résultat
	        int res = is.read();
	        System.out.println(res);
            sc.close();
	        s.close();
	    }
	
}
