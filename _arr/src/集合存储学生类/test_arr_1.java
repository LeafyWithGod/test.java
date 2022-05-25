package 集合存储学生类;

import java.util.ArrayList;
public class test_arr_1 {
    public static void main(String[] args)
    {
        ArrayList<_student> stu=new ArrayList<_student>();
        _student s1= new _student("张三",14);
        _student s2=new _student("李四",16);
        _student s3=new _student("王五",18);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        for(int i=0;i<stu.size();i++)
        {
            _student s=stu.get(i);
            System.out.println(s.getname()+","+s.getage());
        }
    }
}
