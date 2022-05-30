import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        students s1=new students("张三",17);
        students s2=new students();
        s2.setName("李四");
        s2.setAge(20);

        List<students> AL=new ArrayList<>();
        List<students> LL=new LinkedList<>();

        AL.add(s1);
        AL.add(s2);

        LL.add(s1);
        LL.add(s2);

        for(int i=0;i<AL.size();i++){
            students ss1=AL.get(i);
            System.out.println(ss1.getName()+","+ss1.getAge());
            students ss2=LL.get(i);
            System.out.println(ss2.getName()+","+ss2.getAge());
        }
        System.out.println("----------------------");

        Iterator it=AL.iterator();
        while(it.hasNext()){
            students ss1= (students) it.next();
            students ss2= (students) it.next();
            System.out.println(ss1.getName()+","+ss1.getAge()+"  01");
            System.out.println(ss2.getName()+","+ss2.getAge()+"  02");
        }
        System.out.println("----------------------");

        for(students ss1:AL){
            System.out.println(ss1.getName()+","+ss1.getAge());
        }
        for(students ss2:LL){
            System.out.println(ss2.getName()+","+ss2.getAge());
        }
    }
}
