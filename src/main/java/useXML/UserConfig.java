package useXML;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ComponentScan
@ImportResource(value = "classpath:use.xml")
public class UserConfig {
}
