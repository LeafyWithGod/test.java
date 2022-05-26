package _jk_cx;

public abstract class _chouxiang {
    private String name;
    private String gender;
    private int age;

    public _chouxiang(){}
    public _chouxiang(String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public abstract void sleep();

    public abstract void meal();

    @Override
    public String toString() {
        return "_chouxiang{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        _chouxiang chouxiang = (_chouxiang) o;

        if (age != chouxiang.age) return false;
        if (name != null ? !name.equals(chouxiang.name) : chouxiang.name != null) return false;
        return gender != null ? gender.equals(chouxiang.gender) : chouxiang.gender == null;
    }
}
