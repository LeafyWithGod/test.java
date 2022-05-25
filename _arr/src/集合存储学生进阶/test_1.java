package 集合存储学生进阶;

import java.util.ArrayList;
import java.util.Scanner;
public class test_1 {
     public static void main(String[] args)
     {
         ArrayList<student_> arr=new ArrayList<student_>();
         //集合名字arr
         array(arr);
         array(arr);
         array(arr);
         for(int a=0;a<arr.size();a++)
         {
             student_ s=arr.get(a);
             System.out.println(s.getname()+","+s.getage());
         }
     }

     public static void array(ArrayList<student_> arr)
     {
         Scanner sc=new Scanner(System.in);
         //输入字符sc
         student_ stu1=new student_();
         //学生对象stu1
         System.out.println("请输入名字：");
         String s1=sc.nextLine();
         System.out.println("请输入年龄：");
         int i1=sc.nextInt();
         //把键盘获取的名字和年龄给到对象
         stu1.setname(s1);
         stu1.setage(i1);
         //把对象给到集合里面
         arr.add(stu1);
     }
}
