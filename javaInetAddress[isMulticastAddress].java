import java.net.InetAddress;
import java.net.UnknownHostException;

class javaInetAddress15 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean bool = address.isMulticastAddress();
            System.out.println(bool);
            System.out.println(address.isMulticastAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("UnknownHostException");
        }
    }
}
    
