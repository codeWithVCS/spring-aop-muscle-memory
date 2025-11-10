package org.chandra.springaop.topic6_usecases.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private PaymentService paymentService;
    @Override
    public void run(String... args) throws Exception {
        paymentService.processPayment(1000.0);
        System.out.println();
        paymentService.processPayment(0);
        System.out.println();
        paymentService.refundPayment("TXN-1001");
        System.out.println();
        paymentService.refundPayment("");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
