package demo_file;

import java.io.*;
import java.util.ArrayList;

public class DemoFileIterator {


    public static void main(String[] args) {

        String path="F:\\黑马练习";

        File f=new File(path);

        System.out.println("遍历F:\\黑马练习目录下所有文件:");

        System.out.println("==========列表如下===========");

        func(f);


    }

    private static void func(File f) {

        File[] files = f.listFiles();

        for (File file:files) {

            if(file.isDirectory()){

                func(file);

            }

            if(file.isFile()){
                System.out.println(file);
            }

        }


    }

}
