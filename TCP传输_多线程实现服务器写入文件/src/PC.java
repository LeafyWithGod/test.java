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

        br.close();
        sk.close();
    }
}
