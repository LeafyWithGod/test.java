import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        //tolist
        List<String> ll=new ArrayList<String>();
        ll.add("dasuk");
        ll.add("rfg");
        ll.add("87");

        List<String> ls=ll.stream().collect(Collectors.toList());
        for(String s:ls){
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        //toset
        Set<Integer> si=new HashSet<>();
        si.add(19);
        si.add(54);
        si.add(65);
        si.add(86);

        Set<Integer> ss=si.stream().collect(Collectors.toSet());
        for(int i:ss){
            System.out.println(i);
        }
        System.out.println("-----------------------------");
        //tomap
        String[] mmap={"小李,19","张三,18","李四,20","王五,17"};

        Map<String,String> ms=Stream.of(mmap).collect(Collectors.toMap(s->s.split(",")[0],s->s.split(",")[1]));
        Set<String> s1=ms.keySet();
        for(String sss:s1){
            String s2=ms.get(sss);
            System.out.println(sss+","+s2);
        }
    }
}
