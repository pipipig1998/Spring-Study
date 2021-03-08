package com.pipizhu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {
//    @Value("皮皮猪")
    public String name;

    @Value("皮皮猪")
    public void setName(String name) {
        this.name = name;
    }
}
