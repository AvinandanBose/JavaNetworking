package SocketMethods;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
public class socketmethods21 {
    
        static Socket s;
        static Socket s1;
        
        public static void main(String[] args) {
            try {
                s = new Socket("www.google.com", 80);
                System.out.println("Is Connected: " + s.isConnected());
                System.out.println("TCP NoDelay: " + s.getTcpNoDelay());
                s.close();
    
                // Type2
    
                InetAddress inetAddress = InetAddress.getByName("www.google.com");
                int port = 80;
                String localHostName = inetAddress.getHostName();
                SocketAddress socketAddress = new InetSocketAddress(localHostName, port);
                s1 = new Socket();
                s1.connect(socketAddress);
                System.out.println("TCP NoDelay: " + s1.getTcpNoDelay());
    
                s1.close();
    
            } catch (IOException e) {
    
                e.printStackTrace();
                System.out.println("Error: " + e.getMessage());
            }
        }
    
}
