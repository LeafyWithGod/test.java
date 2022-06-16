import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Set<String> SS=new HashSet<>();
        SS.add("hello");
        SS.add("WORD");
        SS.add("windows");
        for(String i:SS){
            System.out.println(i);
        }
        System.out.println("--------------");
        Iterator<String> it=SS.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
