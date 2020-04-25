package javaee.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@ImportResource({"classpath:springJuice.xml"})
public class RoleConfig {
}
