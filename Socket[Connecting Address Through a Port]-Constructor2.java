import java.net.Socket;
import java.net.InetAddress;
class Socket3{
    static Socket s;
     
    public static void main(String[] args) {
        try {
            InetAddress localAdress = InetAddress.getLocalHost();
            
            s = new Socket("www.google.com", 80, localAdress, 8080);
            System.out.println("Socket created");
           

        } catch (Exception e) {
            System.out.println("I/O error " + e);
        }
    }
}
