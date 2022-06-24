public class test {
    public static void main(String[] args) {
        Runnabledemo(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        Runnabledemo(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
    public static void Runnabledemo(Runnable r){
        Thread t=new Thread(r);
        t.start();
    }
}
