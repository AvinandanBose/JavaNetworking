import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketNew5 {
    static Socket socket;

    public static void main(String[] args) {

        try {
            String address = "www.google.com";

            socket = new Socket(address, 80, true); // socket = new Socket("www.google.com", 80, true);
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getPort());

        } catch (UnknownHostException e) {
            System.out.println("Unknown Host");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}