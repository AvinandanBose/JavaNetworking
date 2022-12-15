import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class SocketNew4 {
    static Socket socket;

    public static void main(String[] args) {

        try {
            String address = "www.google.com";
            InetAddress localAdress = InetAddress.getLocalHost();
            socket = new Socket(address, 80, localAdress, 8080); // socket = new Socket("www.google.com", 80,localAdress, 8080);
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getPort());

        } catch (UnknownHostException e) {
            System.out.println("Unknown Host");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}