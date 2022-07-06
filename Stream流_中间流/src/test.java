import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        Stream<String> ss=ls.stream();
        ls.add("zhoujielun");
        ls.add("chenyixun");
        ls.add("zhangbichen");
        ls.add("zhangjie");
        ls.add("linjunjie");

        //截取三个
        // tream<String> s1 = ls.stream().limit(4);
        //跳过三个
        //Stream<String> s2 = ls.stream().skip(2);
        //合并两个流
        //Stream.concat(s1,s2).forEach(System.out::println);
        //抛弃重复的元素并输出;
       //Stream.concat(s1,s2).distinct().forEach(System.out::println);

        //按照开头字母排序
        //ls.stream().sorted().forEach(System.out::println);
        //按照长度排序，长度相同时按照开头字母排序
        ls.stream().sorted((s1,s2)->{
            int numb=s1.length()-s2.length();
            int numb2=numb==0?s1.compareTo(s2):numb;
            return numb2;
        }).forEach(System.out::println);
    }
}
