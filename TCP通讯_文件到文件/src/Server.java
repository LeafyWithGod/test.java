import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //等待数据接收并写入
        ServerSocket ss = new ServerSocket(10086);
        Socket sk = ss.accept();
        //输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        //输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\TCP2.txt"));
        String sr;
        while ((sr = br.readLine()) != null) {
            bw.write(sr);
            bw.newLine();
            bw.flush();
        }
        ss.close();
        bw.close();

        //反馈
        Socket sk2=new Socket("DESKTOP-NPU6985",10085);
        OutputStream is=sk2.getOutputStream();
        is.write("over".getBytes());
        sk2.close();
    }
}
