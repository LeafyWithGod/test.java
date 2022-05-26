package _jk_cx;

public class _w_xiaomei extends _chouxiang implements game{
    public _w_xiaomei(){}

    public _w_xiaomei(String name,String gender,int age){
        super(name,gender,age);
    }

    public void sleep(){
        System.out.println("王小美睡觉");
    }

    public void meal(){
        System.out.println("王小美吃饭");
    }

    public void game(){
        System.out.println("王小美打游戏");
    }
}
