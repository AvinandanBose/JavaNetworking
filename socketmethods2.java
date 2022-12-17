package SocketMethods;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.io.IOException;
public class socketmethods2 {
    static Socket s;
    public static void main(String[] args) throws IOException {
        s = new Socket();
        InetAddress inetAddress = InetAddress.getByName("www.google.com");
        int port = 80;
        SocketAddress socketAddress = new InetSocketAddress(inetAddress, port);
        System.out.println("Socket Address: " + socketAddress);
        s.connect(socketAddress); // It binds socket to a local address and port number.     
        System.out.println("Inet address: " + s.getInetAddress());
        System.out.println("Port number: " + s.getLocalPort());
        System.out.println("Socket Is Bounded: " + s.isBound());
        s.close();
        System.out.println("isClosed:"+ s.isClosed());

       

    }
    
}
