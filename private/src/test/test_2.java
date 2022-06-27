package test;

public class test_2 {
    String name;
    private int age;

    public void setage(int i)
    {
        //age=i;
        if(i<0||i>150){
            System.out.println("你给的数据有误");
        }else{
            age=i;
        }
    }
    public int getage()
    {
        return age;
    }

    public void print()
    {
        System.out.println(name+","+age);
    }
}
