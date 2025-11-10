package org.chandra.springaop.topic3_architecture.task1;

import org.springframework.stereotype.Component;

@Component
public class PlainGreetingService {
    public void greet(String name) {
        System.out.println("Greetings, " + name);
    }
}
