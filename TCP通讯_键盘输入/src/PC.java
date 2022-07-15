import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PC {
    public static void main(String[] args) throws IOException {
        Socket sk=new Socket("DESKTOP-NPU6985",10086);

        //发送
        //获取键盘
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        //判断录入
        String sr;
        while((sr=br.readLine())!=null){
            if("886".equals(sr)){
                break;
            }

            bw.write(sr); //写入
            bw.newLine(); //换行
            bw.flush();   //刷新
        }
        sk.close();

        //等待接收
        ServerSocket ss=new ServerSocket(10085);
        Socket s2=ss.accept();
        BufferedReader br2=new BufferedReader(new InputStreamReader(s2.getInputStream()));
        String sb=br2.readLine();
        System.out.println(sb);
        ss.close();
    }
}
