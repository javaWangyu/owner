package practice;

import java.util.ArrayList;
import java.util.List;

public class Demo {


    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();

        list.add("123");
        list.add("456");
        list.add("1");


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).length()>1){

                list.remove(i);

            }
        }

        System.out.println(list);


    }


}
