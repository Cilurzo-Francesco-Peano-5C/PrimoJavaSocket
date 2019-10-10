/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondoclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eli
 */
public class SecondoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            Socket s = new Socket("localhost",7777);
            //s.getOutputStream().write(341);
            PrintWriter pw = new PrintWriter (s.getOutputStream(),true);
            pw.println("Sono il client");
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(SecondoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}