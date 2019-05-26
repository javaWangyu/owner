package practice.first_second;

/*
*
* 1.定义Content类，要求如下：
(1)成员变量
标题 	title（String 型）
内容 	content（String 型）
(2)成员方法
void show()
要求：输出"需要打印的内容, 标题: xxx, 内容: yyy"
注意： xxx为变量title的值，yyy为变量content值
(3)生成所有成员变量的set/get方法,空参/满参构造

*
* */

public class Content {

    private String title;
    private String content;

    public Content(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Content() {
    }

    public void show(){

        System.out.println(title+"为变量title的值,"+content+"为变量content值");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
