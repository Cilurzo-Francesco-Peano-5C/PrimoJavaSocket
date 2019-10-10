/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoclient;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eli
 */
public class PrimoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            // Creo la connessione con il server
            // Invio un numero

            Socket s = new Socket("localhost",6666);
            s.getOutputStream().write(66);
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(PrimoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
