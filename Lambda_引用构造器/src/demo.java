public class demo {
    public static void main(String[] args) {
//        mystudent((s, a) -> {
//            test t=new test(s,a);
//            System.out.println(t.getName()+","+t.getAge());
//        });
        mystudent(test::new);
    }
    public static void mystudent(studentbd s){
        test t=s.student("小李",19);
        System.out.println(t.getName()+","+t.getAge());
    }
}
