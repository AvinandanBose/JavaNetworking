import java.net.InetAddress;

class javaInetAddressTest {
     public static void main(String[] args) throws Exception {
         InetAddress address[] = InetAddress.getAllByName("www.google.com");
         for (int i = 0; i < address.length; i++) {
            System.out.println(address[i]);
         }
     }
}
