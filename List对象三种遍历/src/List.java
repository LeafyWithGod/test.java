import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args){
        students s1=new students("张三",17);
        students s2=new students();
        s2.setName("李四");
        s2.setAge(20);

        ArrayList<students> ls=new ArrayList<students>();
        ls.add(s1);
        ls.add(s2);

        //1   普通for
        for(int i=0;i<ls.size();i++){
            students s=ls.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("------------------------------");

        //2   迭代器
        Iterator<students> it=ls.iterator();
        while(it.hasNext()){
            students s=it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("------------------------------");

        //3  增强for
        for(students s:ls){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
