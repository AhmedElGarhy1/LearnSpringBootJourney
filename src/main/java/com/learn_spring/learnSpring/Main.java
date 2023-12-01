package com.learn_spring.learnSpring;

import com.learn_spring.learnSpring.simpleService.SimpleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Main{
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(Main.class)){
            var service = context.getBean(SimpleService.class);

            service.seed();
            service.display();
            System.out.println(service.getMax());
        }
    }

}

