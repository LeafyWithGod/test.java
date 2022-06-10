import java.io.File;

public class tool {
    public static void bl(File f){
        File[] f2=f.listFiles();
        if (f2 == null) {
            System.out.println("null");
        }else{
            for(File i:f2){
                if(i.isDirectory()){
                    bl(i);
                }else if(i.isFile()){
                    System.out.println("\t"+i.getAbsolutePath());
                }
            }
        }
    }
}
