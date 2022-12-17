package SocketMethods;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

public class socketmethods7 {

    static Socket s;

    public static void main(String[] args) throws Exception {

        s = new Socket();

        InetAddress inetAddress = InetAddress.getByName("www.google.com");
        int port = 80;
        System.out.println("Local host: " + inetAddress);
        System.out.println("Local host Address: " + inetAddress.getHostAddress());
        System.out.println("Local host Name: " + inetAddress.getHostName());
        System.out.println("Port: " + port);

        String localHostName = inetAddress.getHostName();
        SocketAddress socketAddress = new InetSocketAddress(localHostName, port);
        System.out.println("Socket Address: " + socketAddress);

        s.connect(socketAddress, 1000);

        System.out.println("Is Connected: " + s.isConnected());

        InputStream disInputStream1 = new BufferedInputStream(s.getInputStream());
        DataInputStream disInputStream = new DataInputStream(disInputStream1);

        System.out.println("Input Stream: " + disInputStream1);
        System.out.println("Input Stream: " + disInputStream);

        s.close();

    }

}
