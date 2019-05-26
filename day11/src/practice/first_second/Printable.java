package practice.first_second;

/*
*
*2.定义Printable接口，要求如下：
		(1)定义抽象方法： void printColor(Content content)

 	(2)定义私有方法：
a.void startBlack(),要求：输出"开始打印黑白的内容..."
b.void endBlack(),要求：输出"打印黑白的内容完成..."

(3)定义默认方法:   void printBlack(Content content)
a.首先:调用私有方法startBlack()
b.其次:使用输出语句输出content中的内容,模拟打印效果
格式:正在打印黑白的内容,标题是: xxx,内容是: yyy
注意： xxx为content中的变量title的值，yyy为content中的变量content值
c.最后:调用私有方法endBlack()
(4)定义静态方法:
a.void startColor(),要求：输出"开始打印彩色的内容..."
b.void endColor(),要求：输出"打印彩色的内容完成..."
c.void welcome(),要求：输出"欢迎使用打印功能..."
d.void feedback(),要求：输出"感谢您的使用,有任何建议,请发送邮件到:print@163.com"
*
* */

public interface Printable {
    void printColor(Content content);

   private void startBlack(){

       System.out.println("开始打印黑白的内容...");

   }
   private  void endBlack(){

       System.out.println("打印黑白的内容完成...");

   }

   public default  void printBlack(Content content){

       startBlack();

       System.out.println("正在打印黑白的内容,标题是:"+content.getTitle()+" ,内容是: "+content.getContent());

       endBlack();

   }

   public static void startColor(){

       System.out.println("开始打印彩色的内容...");

   }

   public  static void endColor(){

       System.out.println("打印彩色的内容完成...");

   }

   public static void welcome(){

       System.out.println("欢迎使用打印功能...");

   }

   public static void feedback(){

       System.out.println("感谢您的使用,有任何建议,请发送邮件到:print@163.com");

   }

}
