import java.util.HashSet;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        student s1=new student("张三",18);
        student s2=new student("李四",20);
        student s3=new student("张三",18);
        Set<student> hs1=new HashSet<>();
        hs1.add(s1);
        hs1.add(s2);
        hs1.add(s3);

        for(student s:hs1){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
