package practice;

public interface DemoInterface {

    public  static void show(){

        System.out.println("static");

    }

    public  abstract  void message();

    public default void sayHello(){


    }

    private void add(){

    }

}
