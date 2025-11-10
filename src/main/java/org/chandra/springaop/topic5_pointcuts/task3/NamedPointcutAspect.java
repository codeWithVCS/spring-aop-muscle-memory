package org.chandra.springaop.topic5_pointcuts.task3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NamedPointcutAspect {
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task3.OrderService.*(..))")
    public void orderOperations(){}
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task3.OrderService.create*(..)) || " +
            "execution(* org.chandra.springaop.topic5_pointcuts.task3.OrderService.cancel*(..))")
    public void createOrCancel(){}
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task3.OrderService.track*(..))")
    public void trackingOnly(){}

    @Before("orderOperations()")
    public void beforeOrderOperations(JoinPoint joinPoint){
        System.out.println("[AOP] General Order Operation Invoked: " + joinPoint.getSignature().getName());
    }
    @Before("createOrCancel()")
    public void beforeCreateOrCancelOperations(JoinPoint joinPoint){
        System.out.println("[AOP] Important Order Operation (Create/Cancel): " + joinPoint.getSignature().getName());
    }
    @Before("trackingOnly()")
    public void beforeTrackingOnlyOperations(JoinPoint joinPoint){
        System.out.println("[AOP] Tracking operation detected: " + joinPoint.getSignature().getName());
    }
}
