import com.pipizhu.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //获取Spring上下文对象
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        //而后在上下文中取出来写的XML对象就可以
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
