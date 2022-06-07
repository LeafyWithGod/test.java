import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo {
    public static void main(String[] args){

        people std1=new student();
        people std2=new student();
        people std3=new student();

        Collection<people> cs=new ArrayList<people>();

        std1.setName("张三");
        std1.setAge(18);

        std1.setGender("男");
        std2.setName("李四");
        std2.setAge(19);
        
        std2.setGender("男");
        std3.setName("王五");
        std3.setAge(29);
        std3.setGender("女");

        cs.add(std1);
        cs.add(std2);
        cs.add(std3);

        Iterator it=cs.iterator();
        while(it.hasNext()){
            people p= (people) it.next();
            System.out.println(p);
        }
    }
}
