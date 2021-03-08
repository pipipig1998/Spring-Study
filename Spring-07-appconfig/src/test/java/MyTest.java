import com.pipizhu.config.PipizhuConfig;
import com.pipizhu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(PipizhuConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
