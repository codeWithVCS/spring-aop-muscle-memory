package org.chandra.springaop.topic3_architecture.task1;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
