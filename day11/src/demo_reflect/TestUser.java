package demo_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestUser {


    public static void main(String[] args) {

        try {

            Class<User> userClass= (Class<User>) Class.forName("demo_reflect.User");

            Constructor<User> constructor = userClass.getConstructor();

            User user = constructor.newInstance();

            user.setAge(18);

            user.setName("张三");

            String methodName="show";

            Method method = userClass.getMethod(methodName);

            method.invoke(user);


        } catch (Exception e) {
            e.printStackTrace();
        }


        //2

        try {
            Class<User> userClass = User.class;

            Constructor<User> constructor = userClass.getConstructor();

            User user = constructor.newInstance();

            user.setName("李四");

            user.setAge(20);

            Method show = userClass.getMethod("show");

            show.invoke(user);
        } catch (Exception e) {
            e.printStackTrace();
        }



        //3

        try {
            Class<User> aClass = (Class<User>) new User().getClass();

            Constructor<User> constructor = aClass.getConstructor();

            User user = constructor.newInstance();

            Method message = aClass.getMethod("message", String.class, int.class);

            message.invoke(user,"王宇",21);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }


}
