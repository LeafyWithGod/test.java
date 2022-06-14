import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo_1 {
    public static void main(String[] args) {
        student s1=new student("叶凡",79992);
        student s2=new student("石昊",88999);
        student s3=new student();
        s3.setName("楚风");
        s3.setAge(63999);
        Map<String,student> m=new HashMap<String,student>();
        m.put("210101",s1);
        m.put("210102",s2);
        m.put("210103",s3);

        //方式一，键值对找学生
        Set<Map.Entry<String, student>> ets = m.entrySet();
        for(Map.Entry<String,student> fm:ets){
            String xh=fm.getKey();
            student sd=fm.getValue();
            System.out.println(xh+","+sd.getName()+","+sd.getAge());
        }

        System.out.println("-------------------");
        //方式二，键找值
        Set<String> ks=m.keySet();
        for(String kv:ks){
            System.out.println(kv+","+m.get(kv).getName()+","+m.get(kv).getAge());
        }
    }
}
