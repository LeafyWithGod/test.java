import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia=InetAddress.getByName("DESKTOP-NPU6985");

        String s1=ia.getHostName();
        String s2=ia.getHostAddress();

        System.out.println(s1+","+s2);
    }
}
