import java.net.InetAddress;

class javaInetAddressTest{
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.google.com");
        byte[] ip = address.getAddress();                       
        for (int i = 0; i < ip.length; i++) {
            if (i > 0) {
                System.out.print(".");
            }
            System.out.print(ip[i] & 0xff);
        }
        
    }
}
