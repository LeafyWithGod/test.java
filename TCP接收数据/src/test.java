import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test {
    public static void main(String[] args) throws IOException {
        //创建ServerSockert对象
        ServerSocket ss=new ServerSocket(10086);
        //创建Socket对象调用方法并倾听
        Socket s=ss.accept();
        //调用getInput方法并输出
        InputStream is=s.getInputStream();
        byte[] by=new byte[1024];
        int len=is.read(by);
        String s1=new String(by,0,len);
        System.out.println(s1);

        //释放资源
        s.close();
        ss.close();
    }
}
