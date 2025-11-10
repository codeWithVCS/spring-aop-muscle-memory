package org.chandra.springaop.topic3_architecture.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private GreetingService greetingService;
    @Autowired
    private PlainGreetingService plainGreetingService;
    @Override
    public void run(String... args) throws Exception {
        greetingService.sayHello("Alice");
        plainGreetingService.greet("Bob");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
