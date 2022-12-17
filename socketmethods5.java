package SocketMethods;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.io.IOException;

import java.nio.channels.SocketChannel;

public class socketmethods5 {
    static Socket s;

    public static void main(String[] args) throws IOException {

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

        SocketChannel socketChannel = SocketChannel.open();

        socketChannel.connect(socketAddress);
        s.connect(socketAddress, 1000);

        System.out.println("Is Socket Channel Connected: " + socketChannel.isConnected());
        System.out.println("Is Socket Connected: " + s.isConnected());
        System.out.println("Socket Channel Associated: " + s.getChannel());
        socketChannel.close();

    }

}
