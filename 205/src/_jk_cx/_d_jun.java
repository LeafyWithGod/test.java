package _jk_cx;

public class _d_jun extends _chouxiang implements game{
    public _d_jun() {
    }

    public _d_jun(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("帝君睡觉");
    }

    @Override
    public void meal() {
        System.out.println("帝君吃饭");
    }

    public void game(){
        System.out.println("帝君打游戏");
    }
}
