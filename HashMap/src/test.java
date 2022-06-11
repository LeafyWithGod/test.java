import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>();
        m.put("小红","19");
        m.put("小工","18");

        //m.remove("小红");  //删除小红
        //m.clear();        //清空元素
        //System.out.println(m.containsKey("小红"));    //查看集合是否有小红这个键
        //System.out.println(m.containsValue("19"));    //查看集合是否有19这个值
        //System.out.println(m.isEmpty());  //查看集合是否为空
        //System.out.println(m.size()); //查看集合长度
        System.out.println(m);
    }
}
