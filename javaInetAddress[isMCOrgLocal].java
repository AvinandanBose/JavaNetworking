
import java.net.InetAddress;
import java.net.UnknownHostException;
class javaInetAddress13 {
    
        public static void main(String[] args) {
            try {
                InetAddress address = InetAddress.getByName("www.google.com");
                boolean bool = address.isMCOrgLocal();
                System.out.println(bool);
                System.out.println(address.isMCOrgLocal());
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
    
}
