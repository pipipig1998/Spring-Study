package com.pipizhu.config;

import com.pipizhu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PipizhuConfig.class)
@ComponentScan("com.pipizhu")
public class PipizhuConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
