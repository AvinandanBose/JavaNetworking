import java.net.InetAddress;

class javaInetAddressTest6 {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println(address.hashCode());
    
    }
    
}
