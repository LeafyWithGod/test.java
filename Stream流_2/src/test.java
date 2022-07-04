import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("18");
        ls.add("29");
        ls.add("289");
        ls.add("13");
        ls.add("56");
        //map
//        ls.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
        // mapToInt
//        ls.stream().mapToInt(s->Integer.parseInt(s)).forEach(System.out::println);
        //sun
        int sbb=ls.stream().mapToInt(s->Integer.parseInt(s)).sum();
        System.out.println(sbb);
    }
}
