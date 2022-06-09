import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File f1=new File("D://JAVA//date//java.txt");
        File f2=new File("D://JAVA//date","java2.txt");
        File f3=new File("D://JAVA//date//test");
        File f4=new File(f3,"java.txt");
        File f5=new File("D://JAVA//date");
//        System.out.println(f3.mkdir());  //建立文件夹
//        f1.createNewFile();   //建立文件
        System.out.println(f1.isFile());  //f1是否为文件
        System.out.println(f5.isDirectory());//f5是否为目录
        System.out.println(f1.exists());//f1这个抽象的File对象是否存在
        System.out.println(f1.getAbsolutePath());//返回f1的绝对路径字符串
        System.out.println(f1.getPath());//将f1转换为路径字符串
        System.out.println(f1.getName());//返回f1表示的目录或文件
        String[] s1=f5.list();//将f5这个路径下的所有文件夹和文件都存到数组里面
        for(String i:s1){
            System.out.println(i);
        }

        File[] s2=f5.listFiles();//将f5下面的所有路径或目录打包进File数组里面
        for(File i:s2){
            if(i.isFile()){
                System.out.println(i.getPath());
            }
        }
        //遍历s2File数组，如果File对象为文件，则输出
        File f6=new File("D://JAVA//date//java5");
        System.out.println(f1.delete()+","+f5.delete()); //删除f1的文件，删除f5的路径
    }
}
