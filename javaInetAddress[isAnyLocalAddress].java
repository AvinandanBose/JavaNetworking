 import java.net.InetAddress;
 
 class javaInetAddress7 {
    public static void main(String[] args){
        try{
            InetAddress localhost = InetAddress.getByName("www.google.com");
        Boolean isLocal = localhost.isAnyLocalAddress();
        System.out.println("Name is : " + localhost.getHostName());
        System.out.println("Address is : " + localhost.getHostAddress());
        System.out.println(isLocal);
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
