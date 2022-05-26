package _neibulei;

public class demo {
    public static void main(String[] args) {
        //成员内部类
        test.need t1= new test().new need();
        t1.pr();

        //局部内部类
        test t2=new test();
        t2.need_n();
        t2.nm_2();
    }
}
