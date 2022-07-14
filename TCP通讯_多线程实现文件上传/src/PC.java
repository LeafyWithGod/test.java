import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PC {
    public static void main(String[] args) throws IOException {
        Socket sk=new Socket("DESKTOP-NPU6985",10086);
        //上传
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        BufferedReader br=new BufferedReader(new FileReader("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\TCP.txt"));
        String si;
        while((si=br.readLine())!=null){
            bw.write(si);
            bw.newLine();
            bw.flush();
        }
        //写入完之后给出反馈，表示读取完了，不然一直等待读取
        sk.shutdownOutput();


        //接收
//        ServerSocket ss=new ServerSocket(10085);
//        Socket sk2=ss.accept();
        BufferedReader br2=new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String s2=br2.readLine();
        System.out.println(s2);

        br.close();
        sk.close();
    }
}
