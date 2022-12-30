package SocketMethods;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class socketmethods24 {
    static Socket s;
    static Socket s1;

    public static void main(String[] args) {
        try {
            s = new Socket("www.google.com", 80);
            System.out.println("Is Connected: " + s.isConnected());

            s.close();
            System.out.println("Is Closed: " + s.isClosed());

            // Type2

            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            int port = 80;
            String localHostName = inetAddress.getHostName();
            SocketAddress socketAddress = new InetSocketAddress(localHostName, port);
            s1 = new Socket();
            s1.connect(socketAddress);
            System.out.println("Is Closed: " + s1.isClosed());
            s1.close();
            System.out.println("Is Closed: " + s1.isClosed());
        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}