import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Hello hello = (Hello) ctx.getBean("hello");
        hello.print();
    }
}
