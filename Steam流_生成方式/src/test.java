import java.util.*;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        Stream<String> ss=ls.stream();

        Set<String> sst=new TreeSet<>();
        Stream<String> ss2=sst.stream();
        //Collection可以直接通过调用.stream方法获取stream流


        Map<String,Integer> msi=new HashMap<>();
        Stream<String> ss3=msi.keySet().stream();
        Stream<Integer> si=msi.values().stream();
        //Map则需要调用keyset方法或者values方法获取键/值的stream流
        Stream<Map.Entry<String,Integer>> sm=msi.entrySet().stream();
        //或者通过entryset方法获取键和值一起的流

        String[] Arr={"h","g","f"};
        Stream<String> ss4=Stream.of(Arr);
        Stream<String> ss5=Stream.of("2","3");
        Stream<Integer> si2=Stream.of(20,348,19);
        //数组则需要通过静态方法.of来生成stream流
    }
}
