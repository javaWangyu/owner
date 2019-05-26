package demo_reflect;

public class User {


    private String name;

    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void show(){

        System.out.println("姓名是:"+name+",年龄是:"+age+",很高兴认识大家。");

    }

    public  void message(String name,int age){

        System.out.println("姓名是:"+name+",年龄是:"+age);

    }

}
