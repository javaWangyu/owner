package practice.first_second;

import java.awt.print.PrinterAbortException;
import java.util.List;
import java.util.ArrayList;

/*
*
*(1)调用Printable接口的静态方法welcome()
	(2)创建Printer类的对象printer
(3)创建Content类的对象content(标题:面向对象的三大特征: ,内容:封装,继承,多态)
	(4)创建Worker类的对象worker(姓名:李四,工号:w001)
	(5)按照以下步骤调用方法:
   		 a.按照黑白的方法打印内容,步骤如下:
        	worker对象调用work方法传递参数printer,content,1
    	 b.输出一条分割线"===================="
    	 c.按照彩色的方法打印内容,步骤如下:
        	worker对象调用work方法传递参数printer,content,2
	(6)调用Printable接口的静态方法feedback()

*
* */
public class Test {

    public static void main(String[] args) {

        Printable.welcome();

        Print print=new Print();

        Content content=new Content("标题:面向对象的三大特征: ","内容:封装,继承,多态");

        Worker worker=new Worker("李四","w001");

        worker.work(print,content,1);

        System.out.println("======================");

        worker.work(print,content,2);

        Printable.feedback();



    }


}
