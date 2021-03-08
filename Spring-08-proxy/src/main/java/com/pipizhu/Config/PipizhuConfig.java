package com.pipizhu.Config;

import com.pipizhu.test1.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pipizhu")
public class PipizhuConfig {

    @Bean
    public Client getClient(){
        return new Client();
    }
}
