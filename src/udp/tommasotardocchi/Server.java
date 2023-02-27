/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp.tommasotardocchi;
import java.io.*;
import java.net.*;
/**
 *
 * @author Studenti
 */
public class Server {
    public static void main(String args[]) throws Exception{
        DatagramSocket serverSocket = new DatagramSocket (6789);
        booleqn attivo = true;
        byte[] bufferIN = new byte [1024];
        byte[] bufferOUT = new byte [1024];
        
        System.out.println("Server avviato");
        while(attivo){
            //definizione del datagramma
        DtagramPacket receivePacket(bufferIN,BufferIN.lenght);
            //attesa della ricezione dato dal client
        serverSocket.receive(receivePacket);
            //analisi del pacchetto ricevuto
        String ricevuto = new String(receivePacket.getData());
        int numCaratteri = receivePacket.getLenght();
        ricevuto = ricevuto.substring(0,numCaratteri); // elimina i caratteturi in eccesso
        System.out.println("RICEVUTO: " + ricevuto);
        // riconoscimento dei parametri del socket del Client
        InetAddress IPClient = receivePacket.getAdress();
        int portaClient = receivePacket.getPort();
        //preparo il dato da spedire
        String daSpedire = ricevuto.toUpperCase();
        bufferOut = daSpedire.getBytes();
        //invio del datagramma
        DatagramPacket sendPacket = new DatagramPacket(bufferOUT, bufferOUT.lenght, IPClient);
        serverSocket.send(sendPacket);
        }
    }
}
