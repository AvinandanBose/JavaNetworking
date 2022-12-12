 import java.net.InetAddress;
import java.net.UnknownHostException;
 
 class javaInetAddress10{

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean bool = address.isMCGlobal();
            System.out.println(bool);
            System.out.println(address.isMCGlobal());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
}
