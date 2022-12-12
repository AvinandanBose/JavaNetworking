import java.net.InetAddress;
import java.net.UnknownHostException;

class javaInetAddress18 {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            String str = address.toString();
            System.out.println(str);
            System.out.println(address.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
}
