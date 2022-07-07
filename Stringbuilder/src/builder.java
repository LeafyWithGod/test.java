import java.util.Scanner;
public class builder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.nextLine();
        String str_1=builder_1(str);
        System.out.println(str_1);
    }

    public static String builder_1(String str)
    {
        StringBuilder str1=new StringBuilder(str);
        str1.reverse();
        String str2=str1.toString();
        return str2;
    }
}
