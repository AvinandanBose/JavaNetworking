import java.net.InetAddress;
import java.net.UnknownHostException;

class javaInetAddress9 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean bool = address.isLoopbackAddress();
            System.out.println(bool);
            System.out.println(address.isLoopbackAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
}
