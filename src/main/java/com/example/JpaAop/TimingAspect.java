package com.example.JpaAop;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimingAspect {

    @Around("execution(* com.example.service.AccountService.transferMoney(..))")
    public Object timeMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();  // Proceed with method execution
        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("Time taken by " + joinPoint.getSignature().getName() + " is " + timeTaken + "ms");
        return result;
    }
}
