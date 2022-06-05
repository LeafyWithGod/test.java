import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        student s1=new student("叶凡",19);
        student s2=new student("石昊",20);
        student s3=new student("楚风",18);
        student s4=new student("姬紫月",19);

        List<student> ls=new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);

        Collections.sort(ls, new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                int i=s1.getAge()-s2.getAge();
                int ii=i==0?s1.getName().compareTo(s2.getName()):i;
                return ii;
            }
        });

        for(student i:ls){
            System.out.println(i.getName()+","+i.getAge());
        }
    }
}
