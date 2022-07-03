import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> as=new ArrayList<>();
        as.add("周杰伦");
        as.add("陈奕迅");
        as.add("周深");
        as.add("唐太宗");
        as.add("周武王");

        ArrayList<String> as2=new ArrayList<>();

        for(String s:as){
            if(s.startsWith("周")&&s.length()>2){
                as2.add(s);
            }
        }

        for(String s:as2){
            System.out.println(s);
        }

        System.out.println("-------------");

        //Steam流
        //as.stream().filter(s->s.startsWith("张")&&s.length()==3).forEach(s-> System.out.println(s));
        as.stream().filter(s->s.startsWith("周")).filter(s->s.length()==3).forEach(System.out::println);
    }
}
