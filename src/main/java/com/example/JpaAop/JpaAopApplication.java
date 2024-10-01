package com.example.JpaAop;

import com.example.JpaAop.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaAopApplication implements CommandLineRunner {

	private final ApplicationContext applicationContext;

	public JpaAopApplication(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AccountService accountService = applicationContext.getBean(AccountService.class);
		accountService.transferMoney(1001L, 1002L, 200.00);
	}
}
