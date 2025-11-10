package org.chandra.springaop.topic6_usecases.task2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
    @Pointcut("execution(* org.chandra.springaop.topic6_usecases.task2.ReportService.*(..))")
    public void reportServicePointcut(){}
    @Around("reportServicePointcut()")
    public Object aroundReportService(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("[PERF] Method " + joinPoint.getSignature().getName() +" executed in " + totalTime + " ms");
        return proceed;
    }
}
