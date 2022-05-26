package _neibulei;

public class test{
    private int next=100;

    //成员内部类
    public class need{
        int next_2=200;
        int n3=next+next_2;

        public void pr(){
            System.out.println(n3);
        }
    }

    //局部内部类
    public void need_n(){
        int next_2=300;

        class n1{
            int n2=next+next_2;
            public void need_n1(){
                System.out.println(n2);
            }
        }
        n1 n=new n1();
        n.need_n1();
    }

    //匿名内部类
    public void nm_2(){
        nm n=new nm(){
            int n2=400+next;
            public void nm_1(){
                System.out.println(n2);
            }
        };
        n.nm_1();
    }
}
