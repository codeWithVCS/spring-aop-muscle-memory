package org.chandra.springaop.topic2_aop_concepts.task2;

import org.springframework.stereotype.Component;

@Component
public class TaskService {
    public void completeTask(String taskName){
        System.out.println("Completing task: " + taskName);
    }
    public void failTask(String taskName){
        System.out.println("Failing task: " + taskName);
        throw new RuntimeException("Simulated failure");
    }
}
