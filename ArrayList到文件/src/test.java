import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos1=new BufferedOutputStream(new FileOutputStream("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\test.txt",true));
        BufferedWriter br1=new BufferedWriter(new FileWriter("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\test.txt"));
        ArrayList<String> als1=new ArrayList<>();
        als1.add("abcdefg");
        als1.add("hijklmn");
        als1.add("opq");
        //字节缓冲流
//        for(String s:als1){
//            byte[] by=s.getBytes();
//            bos1.write(by,0,by.length);
//
//        }
//        bos1.flush();
//        bos1.close();

        //字节缓冲流_for
//        for(String s:als1){
//            br1.write(s,0,s.length());
//            br1.newLine();
//        }
//        br1.close();
        //字节缓冲流_while
    }
}
