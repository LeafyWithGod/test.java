import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        List<String> female=new ArrayList<>();
        List<String> male=new ArrayList<>();
        //前三
        male.add("周润发");
        male.add("成龙");
        male.add("刘德华");
        male.add("吴京");
        male.add("周星驰");
        male.add("李连杰");
        //姓林，不要第一个
        female.add("林心如");
        female.add("张曼玉");
        female.add("林青霞");
        female.add("柳岩");
        female.add("林志玲");
        female.add("王祖贤");

        //男只要前三
        Stream<String> s1=male.stream().filter(s->s.length()==3).limit(3);
        //女要信林且不要第一个
        Stream<String> s2=female.stream().skip(1).filter(s->s.startsWith("林"));
        //合并
        Stream<String> s3=Stream.concat(s1,s2);
        //s3.map(Actor::new).forEach(System.out::println);
        s3.map(Actor::new).forEach(p-> System.out.println(p.getName()));
    }
}
