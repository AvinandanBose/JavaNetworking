import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

class javaInetAddress16 {
    
        public static void main(String[] args) {
            try {
                InetAddress address = InetAddress.getByName("www.google.com");
                boolean bool = address.isReachable(1000);
                System.out.println(bool);
                System.out.println(address.isReachable(1000));
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e  ) {
                System.out.println("Exception");// if a network error occurs
            }catch (IllegalArgumentException e) {
                System.out.println("Exception");// if timeout negative
            }
        }
    }
    

