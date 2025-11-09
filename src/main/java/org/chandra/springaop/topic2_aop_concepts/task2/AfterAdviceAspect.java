package org.chandra.springaop.topic2_aop_concepts.task2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdviceAspect {
    @After("execution(* org.chandra.springaop.topic2_aop_concepts.task2.TaskService.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[AOP] Method " +  methodName + " has completed (success or failure)");
    }
}
