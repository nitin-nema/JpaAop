package com.example.JpaAop;

@SpringBootApplication
public class AopExampleApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AopExampleApplication.class, args);
        //for profile
        context.setAdditionalProfiles("dev");
        AccountService accountService = context.getBean(AccountService.class);
        accountService.transferMoney(12345L, 67890L, 250.00);
    }
}
