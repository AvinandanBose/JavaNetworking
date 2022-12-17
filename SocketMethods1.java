
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.io.IOException;

public class SocketMethods1 {
    static Socket s;

    public static void main(String[] args) throws IOException {

        s = new Socket();

        InetAddress inetAddress = InetAddress.getByName(InetAddress.getLocalHost().getHostName());
        int port = 1085;
        System.out.println("Local host: " + inetAddress);
        System.out.println("Local host Address: " + inetAddress.getHostAddress());
        System.out.println("Local host Name: " + inetAddress.getHostName());
        System.out.println("Port: " + port);

        String localHostName = inetAddress.getHostName();
        SocketAddress socketAddress = new InetSocketAddress(localHostName, port);
        System.out.println("Socket Address: " + socketAddress);
        
        s.bind(socketAddress); //It binds socket to a local address and port number.

        System.out.println("Inet address: " + s.getInetAddress());
        System.out.println("Port number: " + s.getLocalPort());
        System.out.println("Socket Is Bounded: " + s.isBound());

    }

}
