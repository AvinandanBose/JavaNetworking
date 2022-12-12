import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

class Answer1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String host;
        try {

            System.out.println("===============================");
            System.out.println(
                    "Welcome to a website that prompts you for a host name, Enter 1, it shows the IP address and asks for more.");
            System.out.println("===============================");
            do {
                System.out.println("Enter a host name: ");
                host = scanner.nextLine();
                InetAddress[] address = InetAddress.getAllByName(host);
                for (InetAddress ip : address) {
                    System.out.println(ip.toString());
                }

            } while (doAgain());

        } catch (UnknownHostException e) {
            System.out.println("Unknown host");
        }
    }

    private static boolean doAgain() {
        System.out.println();
        String s;
        while (true) {
            System.out.println("Do you want to continue? (y/n)");

            s = scanner.nextLine();
            if (s.equalsIgnoreCase("y")) {
                return true;
            } else if (s.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
