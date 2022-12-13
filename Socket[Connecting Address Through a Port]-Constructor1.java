
import java.net.Socket;

 class Socket2 {
     static Socket s;
    public static void main(String[] args) {
        try {
            s = new Socket("www.google.com", 80);
            System.out.println("Socket created");

        } catch (Exception e) {
            System.out.println("I/O error " + e);
        }
    }
}                           

