import java.io.*;
import java.util.Properties;
import java.util.Set;

public class test {
    public static void main(String[] args) throws IOException{
        l();
        s();
    }
    public static void l()throws IOException{
        OutputStreamWriter os=new OutputStreamWriter(new FileOutputStream("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\test2.txt"));
        Properties ppt=new Properties();
        ppt.setProperty("201","张三");
        ppt.setProperty("202","李四");
        ppt.setProperty("203","王五");
        ppt.store(os,null);
        os.close();
    }

    public static void s()throws IOException{
        InputStreamReader is=new InputStreamReader(new FileInputStream("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\test2.txt"));
        Properties ppt=new Properties();
        ppt.load(is);
        Set<String> so=ppt.stringPropertyNames();
        for(String s:so){
            Object o=ppt.getProperty(s);
            System.out.println(s+","+o);
        }
        is.close();
    }
}
