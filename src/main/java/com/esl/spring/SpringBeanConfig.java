package com.esl.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bhanu
 **/
@Configuration
public class SpringBeanConfig {
    @Bean( initMethod ="doSomething")
    public SpringBean springBean(){
        SpringBean springBean = new SpringBean();
        springBean.setText("Hii!");
        return springBean;
    }
}
