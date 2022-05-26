package _zhuanhuan;

public class test {
    public static void main(String[] args) {
        int i1=100;
        int i2;
        int i3;
        String s1="200";
        String s2;
        String s3;
        s2=String.valueOf(i1);    //int转String
        i2=Integer.parseInt(s1);  //String转int
        System.out.println(s2+" "+i2);
        System.out.println("---------------------");
        Integer ii=Integer.valueOf(100);     //手动装箱
        Integer ii2=100;         //自动装箱
        if(ii2!=null)
        ii2+=100;       /*自动拆箱装箱一步到位
        ii2+100为拆箱，再赋值给ii2为装箱*/
        System.out.println(ii2);
    }
}
