public class UpperCasedemo {
    public static void main(String[] args) {
        printString ps=new printString();

        //Lambda
        print(s -> {
            ps.printUpperCase(s);
        });

        //引用
        print(ps::printUpperCase);
    }
    public static void print(print p){
        p.printUpperCase("sadghhasd");
    }
}
