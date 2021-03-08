import com.pipizhu.dao.UserDaoMysqlimpl;
import com.pipizhu.dao.UserDaoOrcleimpl;
import com.pipizhu.service.UserServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserServiceimpl userServiceimpl=new UserServiceimpl();
//        userServiceimpl.setUserdao(new UserDaoMysqlimpl());
//        userServiceimpl.getUser();

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserServiceimpl serviceimpl = (UserServiceimpl) context.getBean("serviceimpl");
        serviceimpl.getUser();
    }
}
