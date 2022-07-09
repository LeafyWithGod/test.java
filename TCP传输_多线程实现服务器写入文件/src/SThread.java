import java.io.*;
import java.net.Socket;

public class SThread implements Runnable {
    private Socket s;

    public SThread() {
    }

    public SThread(Socket s) {
        this.s=s;
    }

    public void run() {
        try {
            int i=0;
            File f=new File("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\TCP"+i+".txt");
            //如果路径存在，则i++
            while(f.exists()) {
                    i++;
                    f = new File("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\TCP" + i + ".txt");
                    break;
            }
            f.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String si;
            while((si=br.readLine())!=null){
                bw.write(si);
                bw.newLine();
                bw.flush();
            }
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
