import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketNew3 {
static Socket socket;
    public static void main(String[] args) {

        try {
           String address = "www.google.com";
            socket = new Socket(address, 80);// socket = new Socket("www.google.com", 80);
            System.out.println(socket.getLocalAddress());
            System.out.println(socket.getLocalPort());
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getPort());
            System.out.println(socket.getLocalSocketAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
