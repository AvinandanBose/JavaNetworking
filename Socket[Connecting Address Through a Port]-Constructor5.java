import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URL;
import java.net.URLConnection;

class Socket6 {

    public static void main(String[] args) throws Exception {
        SocketAddress addr = new InetSocketAddress("www.google.com", 80);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
        Socket s = new Socket(proxy);
        Proxy socksProxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("www.google.com", 1080));
        Socket s1 = new Socket(socksProxy);
    

        System.out.println("Connected");

        try {
            URL url = new URL("https://www.google.com/");
            URLConnection conn = url.openConnection(proxy);
            URLConnection conn1 = url.openConnection(socksProxy);

        } catch (Exception e) {
            System.out.println("I/O error " + e);
        }

        System.out.println("Proxy Type: " + proxy.type());
        System.out.println("Proxy Address: "
                + proxy.address());

        System.out.println("Proxy Type: " + socksProxy.type());
        System.out.println("Proxy Address: "
                + socksProxy.address());

    }

}
