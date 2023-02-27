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
public class Client {
      public static void main(String args[]) throws Exepticion{
        int portaServer = 6789; //porta del Server
          InetAddres IPServer = InetAddres.getByName("localhost");
          
          byte[] bufferOUT = new byte[1024];
          byte[] bufferIN = new byte[1024];
          BufferReader input = new BufferedReader(new InputStreaReader(System.in));
    }

DatagramSocket clientSocket = new DatagramSocket();
System.out.println("Client pronto - inserisci un dato da inviare:");
String daSpedire = input.readLine();
bufferOUT = daSpedire.getBytes();

DatagramPacket sendPacket = new DatagramPacket(bufferOUT, bufferOUT.lenght, IPServer, portaServer);
clientSocket.send(sendPacket);

DtagramPacket receivePacket = new DatagramPacket(bufferIN, bufferIN.lenght);
clientSocket.receive(receivePacket);
String ricevuto = new String(receivePacket.getData());
}
