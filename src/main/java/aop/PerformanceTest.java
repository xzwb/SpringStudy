package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformanceConfig.class)
public class PerformanceTest {
    @Autowired
    Performance performance;

    @Test
    public void perform() {
//        performance.perform();
        performance.perform(5);
        Thank thank = (Thank)performance;
        thank.thanks();
    }
}
