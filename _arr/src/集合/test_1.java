package 集合;

import java.util.ArrayList;

public class test_1 {
    public static void main(String[] args)
    {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("张三");
        arr.add("李四");
        arr.add("王五");
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println(arr.size());
    }
}
