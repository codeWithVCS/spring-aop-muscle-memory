package org.chandra.springaop.topic2_aop_concepts.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private TaskService taskService;
    @Override
    public void run(String... args) throws Exception {
        taskService.completeTask("Deploy Module");
        try{
            taskService.failTask("Compile Code");
        }
        catch(RuntimeException e){
            System.out.println("Exception caught in runner: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
