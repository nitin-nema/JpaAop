package com.example.JpaAop;

//`public class profile {
//}`
// examples of profile specifc bean

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev", "test"})
public class DevConfig{
    @Bean
    public MyService myService(){
        return new MyService("Developement service");
    }
}

@Configuration
@Profile("prod")
public class ProdConfig{
    @Bean
    public MyService myService(){
        return new MyService("Productuion service");
    }
}
