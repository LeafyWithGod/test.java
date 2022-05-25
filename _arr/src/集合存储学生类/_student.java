package 集合存储学生类;

public class _student {
    private String name;
    private int age;

    public _student(){}

    public _student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }

    public void setage(int age)
    {
        this.age=age;
    }
    public int getage()
    {
        return age;
    }

    public void moring()
    {
        System.out.println("看书");
    }
    public void afternoon()
    {
        System.out.println("学习");
    }
}
