import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
    public static void main(String[] args) {
        try{
            InetAddress ipAddress= InetAddress.getLocalHost();
            System.out.println("\nIP Address of the machine=>"+ipAddress.getHostAddress());

        }catch(UnknownHostException ex){
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}