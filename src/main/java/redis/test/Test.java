package redis.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import redis.pojo.User;

public class Test {
    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("redis.xml");
        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
        User user = new User();
        user.setId(1);
        user.setName("yyf");
        redisTemplate.opsForValue().set("user", user);
        User user1 = (User) redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }
}
