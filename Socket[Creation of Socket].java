import java.io.IOException;
import java.net.Socket;



class Socket1 {
    static Socket s ;
    public static void main(String[] args) {
        try {
            s= new Socket();
            System.out.println("Socket created");

        } catch (Exception e) {
            System.out.println("I/O error " + e);
        }
    }
    
}
