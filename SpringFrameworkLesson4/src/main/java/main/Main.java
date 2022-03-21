package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloService;

public class Main {

    public static void main(String[] args) {
        try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService helloService = c.getBean(HelloService.class);
            String mssg = helloService.hello("akram");
            System.out.println(mssg);
        }
    }
}
