package com.esl.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bhanu
 **/
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage1("message set 1");
        helloWorld.setMessage2("message set 2");
        return helloWorld;
    }

}
