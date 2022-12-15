import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;


import java.net.InetAddress;

class SocketNew6 {

    static Socket s;
    static Socket s1;
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.google.com");
        SocketAddress addr = new InetSocketAddress(address.getHostName(), 80);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
         s = new Socket(proxy);
        Proxy socksProxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("www.google.com", 1080));
         s1 = new Socket(socksProxy);

        System.out.println("Connected");

        

        System.out.println("Proxy Type: " + proxy.type());
        System.out.println("Proxy Address: "
                + proxy.address());

        System.out.println("Proxy Type: " + socksProxy.type());
        System.out.println("Proxy Address: "
                + socksProxy.address());

    }

}