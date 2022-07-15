import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ssk=new ServerSocket(10086);
        //等待接收
        Socket sk=ssk.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String sr;
        while((sr=br.readLine())!=null){
            System.out.println(sr);
        }
        ssk.close();

        //返回
        Socket sk2=new Socket("DESKTOP-NPU6985",10085);
        String s4="over";
        OutputStream os=sk2.getOutputStream();
        os.write(s4.getBytes(StandardCharsets.UTF_8));
        sk2.close();
    }
}
