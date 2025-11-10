package org.chandra.springaop.topic5_pointcuts.task1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DesignatorAspect {
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task1.EmployeeService.addEmployee(..))")
    public void employeeServiceExecutionPointcut(){}
    @Pointcut("within(org.chandra.springaop.topic5_pointcuts.task1.EmployeeService)")
    public void employeeServiceWithinPointcut(){}
    @Pointcut("args(String) && within(org.chandra.springaop.topic5_pointcuts.task1..*)")
    public void employeeServiceArgsPointcut(){}
    @Pointcut("this(org.chandra.springaop.topic5_pointcuts.task1.EmployeeService)")
    public void employeeServiceThisPointcut(){}
    @Pointcut("target(org.chandra.springaop.topic5_pointcuts.task1.EmployeeService)")
    public void employeeServiceTargetPointcut(){}
    @Before("employeeServiceExecutionPointcut()")
    public void beforeEmployeeServiceExecutionPointcut(){
        System.out.println("[AOP] execution(): addEmployee matched");
    }
    @Before("employeeServiceWithinPointcut()")
    public void beforeEmployeeServiceWithinPointcut(){
        System.out.println("[AOP] within(): inside EmployeeService");
    }
    @Before("employeeServiceArgsPointcut()")
    public void beforeEmployeeServiceArgsPointcut(){
        System.out.println("[AOP] args(): method taking String parameter matched");
    }
    @Before("employeeServiceThisPointcut()")
    public void beforeEmployeeServiceThisPointcut(){
        System.out.println("[AOP] this(): proxy is of EmployeeService type");
    }
    @Before("employeeServiceTargetPointcut()")
    public void beforeEmployeeServiceTargetPointcut(){
        System.out.println("[AOP] target(): actual target object is EmployeeService");
    }
}
