import java.net.InetAddress;
import java.net.UnknownHostException;

class javaInetAddress12 {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean bool = address.isMCNodeLocal();
            System.out.println(bool);
            System.out.println(address.isMCNodeLocal());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
}
