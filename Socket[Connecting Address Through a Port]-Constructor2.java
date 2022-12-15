
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class SocketNew {
    static Socket socket ;
    public static void main(String[] args)  {

        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            InetAddress localAdress = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            
            socket = new Socket(address.getHostName(),80,  localAdress, 8080);
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getPort());
           
           
        }catch(UnknownHostException e){
            System.out.println("Unknown Host");
        } catch (IOException e) {
            
            e.printStackTrace();
        }


    }
    
}
