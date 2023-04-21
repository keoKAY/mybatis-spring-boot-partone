package com.istad.mybatisfirstlesson.configuration;

import com.istad.mybatisfirstlesson.model.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeanConfiguration {

    @Bean
    @Scope("prototype")
    public SampleBean getFirstBean(){
        return new SampleBean("First Bean ", "Male");
    }
}
