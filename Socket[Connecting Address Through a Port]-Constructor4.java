import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class SocketNew {
    static Socket socket = new Socket();
    public static void main(String[] args)  {

        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            SocketAddress addr = new InetSocketAddress(address.getHostName(), 80);
            System.out.println(addr);
            socket.connect(addr);
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getPort());
           
           
        }catch(UnknownHostException e){
            System.out.println("Unknown Host");
        } catch (IOException e) {
            
            e.printStackTrace();
        }


    }
    
}
