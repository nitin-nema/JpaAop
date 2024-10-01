package com.example.JpaAop;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public AccountService accountService() {
        return new AccountService();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
