import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class test {
    public static void main(String[] args) throws IOException {
        //方法一
//        Socket s=new Socket(InetAddress.getByName("DESKTOP-NPU6985"),10086);
        //方法二
        Socket s=new Socket("DESKTOP-NPU6985",10086);

        OutputStream os=s.getOutputStream();
        os.write("hello,tcp".getBytes());

        s.close();
    }
}
