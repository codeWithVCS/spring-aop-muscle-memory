package org.chandra.springaop.topic6_usecases.task4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionHandlingAspect {
    @Pointcut("execution(* org.chandra.springaop.topic6_usecases.task4.PaymentService.*(..))")
    public void paymentServicePointCut(){}
    @AfterThrowing(pointcut = "paymentServicePointCut()", throwing = "exception")
    public void afterThrowingPaymentService(JoinPoint joinPoint, Exception exception){
        String methodName = joinPoint.getSignature().getName();
        String message = exception.getMessage();
        System.out.println("[ERROR] Exception in method " + methodName + ": " + message);
        System.out.println("[RECOVERY] Fallback action: Logging and continuing system flow");
    }
    @Around("paymentServicePointCut()")
    public void aroundPaymentService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("[HANDLER] Suppressing exception and continuing flow for " + proceedingJoinPoint.getSignature().getName());
        }
    }
}
