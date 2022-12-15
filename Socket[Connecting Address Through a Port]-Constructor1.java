
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class SocketNew {

    public static void main(String[] args)  {

        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            Socket socket = new Socket(address.getHostAddress(), 80);
            System.out.println(socket.getLocalAddress());
            System.out.println(socket.getLocalPort());
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getPort());
            System.out.println(socket.getLocalSocketAddress());
        }catch(UnknownHostException e){
            System.out.println("Unknown Host");
        } catch (IOException e) {
            
            e.printStackTrace();
        }


    }
    
}                         

