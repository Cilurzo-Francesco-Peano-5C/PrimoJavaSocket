/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eli
 */
public class SecondoServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            // TODO code application logic here

            ServerSocket ss = new ServerSocket(7777);
            for (;;) {
                Socket s;
                s = ss.accept();
                // int i =s.getInputStream().read();
                InputStreamReader isr= new InputStreamReader(s.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Il server ha ricevuto: " + br.readLine() );
                s.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(SecondoServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
