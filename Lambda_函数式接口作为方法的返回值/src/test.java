import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        ArrayList<String> as=new ArrayList<>();
        as.add("aaaa");
        as.add("ccc");
        as.add("bb");
        System.out.println(as);
        Collections.sort(as);
        System.out.println(as);
        Collections.sort(as,Collectiondem0());
        System.out.println(as);
    }
    public static Comparator<String> Collectiondem0(){
        Comparator<String> coo=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();
                return i;
            }
        };
        return coo;
    }
}
