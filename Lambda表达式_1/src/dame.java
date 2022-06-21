public class dame{
    public static void main(String[] args) {
        eata e=new eata();
        Eata(e);

        //匿名内部类
        Eata(new eata(){
            public void eat(){
                System.out.println("hi");
            }
        });

        //Lambda
        Eata(() -> {
            System.out.println("hi");
        });
    }

    public static void Eata(eatable e){
        e.eat();
    }
}
