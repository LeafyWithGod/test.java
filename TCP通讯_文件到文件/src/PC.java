import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PC {
    public static void main(String[] args) throws IOException {
        //传输数据
        Socket sk=new Socket("DESKTOP-NPU6985",10086);
        //输入
        BufferedReader br=new BufferedReader(new FileReader("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\TCP.txt"));
        //输出
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        String sr;
        while((sr=br.readLine())!=null){
            bw.write(sr);
            bw.newLine();
            bw.flush();
        }
        sk.close();
        br.close();

        //接收
        ServerSocket ss=new ServerSocket(10085);
        Socket sk2=ss.accept();
        InputStream is=sk2.getInputStream();
        byte[] by=new byte[1024];
        int len;
        while((len=is.read(by))!=-1){
            System.out.println(new String(by,0,len));
        }
        ss.close();
    }
}
