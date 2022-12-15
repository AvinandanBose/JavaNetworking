
import java.net.Socket;

public class SocketNew {

    public static void main(String[] args) {

        try {
            new Socket();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println("I/O error " + e);
        }

    }

}
