import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);

        while(true){
            Socket sk=ss.accept();
            new Thread(new SThread(sk)).start();
        }
    }
}
