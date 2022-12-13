import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

class Socket5 {
    static Socket s = new Socket();

    public static void main(String[] args) throws Exception {
        SocketAddress addr = new InetSocketAddress("www.google.com", 80);

        s.connect(addr);

        System.out.println("Connected");
    }
}
