import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("红猫","蓝图");
        map.put("宫村·","堀");
        map.put("菠萝吹雪","梨花诗");
        map.put("叶凡","姬紫月");
        map.put("石昊","火灵儿");

//        Set<String> j=map.keySet();
//        for(String i:j){
//            String ss=map.get(i);
//            System.out.println(i+","+ss);
//        }

        Set<Map.Entry<String, String>> es = map.entrySet();
        for(Map.Entry<String,String> m:es){
            String k=m.getKey();
            String v=m.getValue();
            System.out.println(k+","+v);
        }
    }
}
