import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        Socket sk=ss.accept();

        //接收写入
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\TCP2.txt"));
        BufferedReader br=new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String si;
        while((si= br.readLine())!=null){
            bw.write(si);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        bw2.write("over");
        bw.flush();

        bw.close();
        ss.close();
    }
}
