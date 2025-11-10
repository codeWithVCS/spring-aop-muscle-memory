package org.chandra.springaop.topic5_pointcuts.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private OrderService orderService;
    @Override
    public void run(String... args) throws Exception {
        orderService.createOrder("ORD-101");
        orderService.cancelOrder("ORD-102");
        orderService.trackOrder("ORD-103");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
