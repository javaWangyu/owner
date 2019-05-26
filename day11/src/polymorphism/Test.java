package polymorphism;

public class Test {

    public static void main(String[] args) {

        Fu fu=new Zi();

        //fu优先使用父类成员变量
        String name = fu.name;

        System.out.println(name);

        //fu优先使用子类方法
        fu.a();



    }

}
