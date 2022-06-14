import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo_2 {
    public static void main(String[] args) {
        student s1=new student("喜羊羊",18);
        student s2=new student("美羊羊",17);
        student s3=new student("沸羊羊",18);
        student s4=new student("沸羊羊",18);

        Map<student,String> hm=new HashMap();
        hm.put(s1,"220101");
        hm.put(s2,"220102");
        hm.put(s3,"220103");
        hm.put(s4,"220104");

        //方法一
        Set<student> ss=hm.keySet();
        for(student sd:ss){
            String sr=hm.get(sd);
            System.out.println(sr+","+sd.getName()+","+sd.getAge());
        }
        System.out.println("-----------------------------");
        //方法二
        Set<Map.Entry<student,String>> me=hm.entrySet();
        for(Map.Entry<student,String> i:me){
            student sd=i.getKey();
            String st=i.getValue();
            System.out.println(st+","+sd.getName()+","+sd.getAge());
        }
    }
}
