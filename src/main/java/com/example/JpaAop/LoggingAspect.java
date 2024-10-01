package com.example.JpaAop;

@Aspect
public class LoggingAspect {

    // Define Pointcut: Match execution of any method in AccountService class
    @Pointcut("execution(* com.example.service.AccountService.*(..))")
    public void accountServiceMethods() {}

    // Before Advice: Run this before any AccountService method
    @Before("accountServiceMethods()")
    public void logBeforeMethod(JoinPoint joinPoint) {
        System.out.println("Executing: " + joinPoint.getSignature().getName());
    }
}

