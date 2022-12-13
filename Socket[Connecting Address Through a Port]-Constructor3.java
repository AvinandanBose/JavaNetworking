
import java.net.Socket;

class Socket4 {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket( ); 
        s.connect( new java.net.InetSocketAddress("www.google.com", 80));
        System.out.println("Socket is connected: " + s.isConnected());
        System.out.println("Socket is closed: " + s.isClosed());
        s.close();
        System.out.println("Socket is connected: " + s.isConnected());
        System.out.println("Socket is closed: " + s.isClosed());
    }
    
}
