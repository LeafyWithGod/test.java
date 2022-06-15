import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串");
        String ss=sc.nextLine();
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<ss.length();i++){
            Character i2=ss.charAt(i);
            int j=1;
            if(m.containsKey(i2)){
                int mg=m.get(i2);
                m.put(i2,mg+1);
            }else{
                m.put(i2,j);
            }
        }

        Set<Map.Entry<Character,Integer>> sme=m.entrySet();
        for(Map.Entry<Character,Integer> i:sme){
            char c=i.getKey();
            int ii=i.getValue();
            System.out.println(c+"("+ii+")");
        }
    }
}
