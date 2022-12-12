 import java.net.InetAddress;
import java.net.UnknownHostException;
 
 class javaInetAddress14 {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean bool = address.isMCSiteLocal();
            System.out.println(bool);
            System.out.println(address.isMCSiteLocal());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
}
