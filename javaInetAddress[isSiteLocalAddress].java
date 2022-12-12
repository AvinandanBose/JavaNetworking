import java.net.InetAddress;
import java.net.UnknownHostException;

class javaInetAddress17 {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("www.google.com");
            System.out.println("www.google.com is site local address? " + addr.isSiteLocalAddress());
            addr = InetAddress.getByName("www.yahoo.com");
            System.out.println("www.yahoo.com is site local address? " + addr.isSiteLocalAddress());
            addr = InetAddress.getByName("www.microsoft.com");
            System.out.println("www.microsoft.com is site local address? " + addr.isSiteLocalAddress());
            addr = InetAddress.getByName("www.ibm.com");
            System.out.println("www.ibm.com is site local address? " + addr.isSiteLocalAddress());
            addr = InetAddress.getByName("www.sun.com");
            System.out.println("www.sun.com is site local address? " + addr.isSiteLocalAddress());
        } catch (UnknownHostException e) {
            System.out.println("Exception caught = " + e.getMessage());
        }
    }
}