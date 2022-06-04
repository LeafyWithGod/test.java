import java.util.Scanner;
public class charAt_ {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str=sc.nextLine();
        int i=0;
        for(i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
