package _jk_cx;
import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        Scanner sc_s=new Scanner(System.in);
        _chouxiang wxm=new _w_xiaomei();
        _chouxiang dj=new _d_jun();
        String w_name=sc_s.nextLine();
        String w_gender=sc_s.nextLine();
        int w_age=sc_s.nextInt();
        wxm.setAge(w_age);
        wxm.setName(w_name);
        wxm.setGender(w_gender);
        System.out.println(wxm.getName()+" "+wxm.getGender()+" "+wxm.getAge());
    }
}
