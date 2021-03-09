import com.pipizhu.service.Animal;
import com.pipizhu.service.UserService;
import com.pipizhu.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = context.getBean("userservice", UserService.class);
        userservice.add();
        Animal dog=context.getBean("dog",Animal.class);
        dog.shout();
    }
}
