import java.net.InetAddress;
import java.net.UnknownHostException;

class javaInetAddress11 {
     public static void main(String[] args) {
         try {
             InetAddress address = InetAddress.getByName("www.google.com");
             boolean bool = address.isMCLinkLocal();
             System.out.println(bool);
             System.out.println(address.isMCLinkLocal());
         } catch (UnknownHostException e) {
             e.printStackTrace();
         }
     }
    
}
