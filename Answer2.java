import java.net.InetAddress;
import java.net.UnknownHostException;
public class Answer2 {

    public static void main(String[] args) {
        try {
            System.out.println("Printing IP address of localhost");
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("IP Address:- " + localhost.getHostAddress());
            String hostname = localhost.getHostName();
            System.out.println("Printing IP address of Computer name: " + hostname);
            localhost = InetAddress.getByName(hostname);
            System.out.println(localhost);

            System.out.println("Printing IP address of www.google.com");
            InetAddress in[] = InetAddress.getAllByName("www.google.com");
            for (InetAddress ip : in) {
                System.out.println(ip);
            }

            
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
