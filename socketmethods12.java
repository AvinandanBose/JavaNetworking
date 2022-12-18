package SocketMethods;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
public class socketmethods12 {

    static Socket s;
    static Socket s1;
    public static void main(String[] args) {
        try {

            
            s = new Socket("www.google.com", 80);
            OutputStream os = s.getOutputStream();
            DataOutputStream outputStream = new DataOutputStream(os);
            System.out.println("Is Connected: " + s.isConnected());
            System.out.println("OutputStream: " + outputStream);
            s.close();

            //Type2 

            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            int port = 80;
            String localHostName = inetAddress.getHostName();
            SocketAddress socketAddress = new InetSocketAddress(localHostName, port);
            s1 = new Socket();
            s1.connect(socketAddress);

            OutputStream os1 = s1.getOutputStream();
            DataOutputStream outputStream1 = new DataOutputStream(os1);

            System.out.println("Is Connected: " + s1.isConnected());
            
            System.out.println("OutputStream: " + outputStream1);

            s1.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
    

