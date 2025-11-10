package org.chandra.springaop.topic3_architecture.task1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProxyTypeAspect {
    @Pointcut("execution(* org.chandra.springaop.topic3_architecture.task1.GreetingServiceImpl.*(..))")
    public void greetingServicePointcut(){}
    @Pointcut("execution(* org.chandra.springaop.topic3_architecture.task1.PlainGreetingService.*(..))")
    public void plainGreetingServicePointcut(){}

    @Before("greetingServicePointcut() || plainGreetingServicePointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("[AOP] Proxy type for target: " + joinPoint.getThis().getClass().getName());
    }

}
