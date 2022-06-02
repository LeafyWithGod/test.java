import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<String,String> hash1=new HashMap<>();
        Map<String,String> hash2=new HashMap<>();
        Map<String,String> hash3=new HashMap<>();

        List<Map<String,String>> arrls=new ArrayList<>();

        hash1.put("亚当","夏娃");
        hash1.put("钢铁侠","美队");
        hash2.put("牛郎","织女");
        hash3.put("至尊宝","紫霞");

        arrls.add(hash1);
        arrls.add(hash2);
        arrls.add(hash3);

        for(Map<String,String> map:arrls){
            Set<Map.Entry<String,String>> sme=map.entrySet();
            for(Map.Entry<String,String> i:sme){
                String s1=i.getKey();
                String s2=i.getValue();
                System.out.println(s1+","+s2);
            }
            System.out.println("--------------------");
        }
    }
}
