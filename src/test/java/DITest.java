import di.service.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    @Test
    public void diTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService myService = (MyService) applicationContext.getBean("myServiceImpl");
        myService.add();
    }
}
