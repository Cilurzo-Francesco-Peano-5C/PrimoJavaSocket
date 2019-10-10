/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eli
 */
public class PrimoServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            // Istanzio un server che si mette in ascolto su una specifica porta
            // Accetto la connessione sulla porta specificata
            // Leggo i dati che arrivano dal client
            // Il server si rimette in ascolto

            ServerSocket ss = new ServerSocket(6666);
            for (;;) {
                Socket s;
                s = ss.accept();
                int i =s.getInputStream().read();
                System.out.println("Il server ha ricevuto: " + i );
                s.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(PrimoServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
