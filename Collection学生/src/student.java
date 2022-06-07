public class student extends people{
    public student(){}
    public student(String name,int age,String gender){
        super(name,age,gender);
    }

    public void job(){
        System.out.println("学习");
    }
}
