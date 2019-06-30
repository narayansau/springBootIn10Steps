package com.example.springbootin10step;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootin10stepApplication{

    public static void main(String[] args) {
     int i = 1;
       ApplicationContext context =
                SpringApplication.run( Springbootin10stepApplication.class, args );

       for(String  name : context.getBeanDefinitionNames() ) {
           System.out.println( "Fn no. : "+ i++ + " : "  + name );
       }

    }

}
