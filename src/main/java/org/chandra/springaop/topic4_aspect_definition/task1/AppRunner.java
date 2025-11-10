package org.chandra.springaop.topic4_aspect_definition.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private NotificationService  notificationService;
    @Override
    public void run(String... args) throws Exception {
        notificationService.sendEmail("john@example.com");
        notificationService.sendSMS("9999999999");
    }
    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
