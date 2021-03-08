import com.pipizhu.Config.PipizhuConfig;
import com.pipizhu.test1.Client;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void Test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(PipizhuConfig.class);
        Client client = (Client) context.getBean("getClient");
        client.buy();
    }
}
