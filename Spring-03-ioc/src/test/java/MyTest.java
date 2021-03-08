import com.pipizhu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        new User();
        //下面验证ioc实现了new方法的例子
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("bieming");
        user.show();
    }
}
