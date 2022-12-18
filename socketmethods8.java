package SocketMethods;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
public class socketmethods8 {

    static Socket s;

    public static void main(String[] args) throws Exception {

        s = new Socket();
        s.setKeepAlive(true);
        InetAddress inetAddress = InetAddress.getByName("www.google.com");
        int port = 80;
        System.out.println("Local host: " + inetAddress);
        System.out.println("Local host Address: " + inetAddress.getHostAddress());
        System.out.println("Local host Name: " + inetAddress.getHostName());
        System.out.println("Port: " + port);

        String localHostName = inetAddress.getHostName();
       SocketAddress socketAddress = new InetSocketAddress(localHostName, port);
        System.out.println("Socket Address: " + socketAddress);

        s.connect(socketAddress);
        

        System.out.println("Is Connected: " + s.isConnected());
        
        System.out.println("Keep Alive: " + s.getKeepAlive());

        s.close();

    }
    
}
