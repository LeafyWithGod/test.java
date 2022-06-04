import java.util.Scanner;
public class _tj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.nextLine();
        int i=0;
        int A=0;
        int a=0;
        int s=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                A++;
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                a++;
            }else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                s++;
            }
        }
        System.out.println("大写字母有"+A+"个");
        System.out.println("小写字母有"+a+"个");
        System.out.println("数字有"+s+"个");
    }
}
