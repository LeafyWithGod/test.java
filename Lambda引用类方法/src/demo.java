public class demo {
    public static void main(String[] args) {
        prin(String::substring);
    }

    public static void prin(test t){
        String s=t.te("hello",0,3);
        System.out.println(s);
    }
}
