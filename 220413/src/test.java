import java.io.*;

public class test {
    public static void main(String[] args) {
        try(BufferedWriter br=new BufferedWriter(new FileWriter("D:\\JAVA\\ideaIU_2021.2.3_Portable\\test1\\test.txt"))){
            String ss="说脏话，不乖 ";
            for(int i=0;i<50;i++){
                for(int j=0;j<10;j++){
                    br.write(ss);
                }
                br.write("\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
