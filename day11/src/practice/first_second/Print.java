package practice.first_second;
/*
*
* 3.定义Printer类，要求如下：
(1)实现Printable接口
(2)重写Printable接口中的抽象方法printColor(Content content)
a.首先:调用Printable接口的静态方法startColor()
b.其次:使用输出语句输出content中的内容,模拟打印效果
格式:正在打印彩色的内容,标题是: xxx,内容是: yyy
注意： xxx为content中的变量title的值，yyy为content中的变量content值
c.最后:调用Printable接口的静态方法endColor()

*
* */
public class Print implements Printable {

    @Override
    public void printColor(Content content) {

        Printable.startColor();
        System.out.println("正在打印彩色的内容,标题是:"+content.getTitle()+",内容是: "+content.getContent());
        Printable.endColor();

    }



}
