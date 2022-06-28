import java.util.Properties;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Properties ppt=new Properties();
        ppt.put("1087","张三");
        ppt.put("2876","李四");
        Set<Object> so=ppt.keySet();
        for(Object o:so){
            Object o2=ppt.get(o);
            System.out.println(o+","+o2);
        }
    }
}
