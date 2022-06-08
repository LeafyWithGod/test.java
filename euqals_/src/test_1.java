import java.util.Scanner;

public class test_1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name="xiaozhi";
        String password="landeji123";
        int i=0;
        for(i=0;i<3;i++)
        {
            System.out.println("请输入用户名：");
            String name_1=sc.nextLine();
            System.out.println("请输入密码：");
            String password_1=sc.nextLine();
            if(name.equals(name_1)&&password.equals(password_1))
            {
                System.out.println("登陆成功！");
                break;
            }else if(2-i>0){
                System.out.println("账号或密码错误，你还有"+(2-i)+"次机会");
            }else
            {
                System.out.println("账号冻结，请联系管理员！");
                break;
            }
        }
    }
}
