package org.chandra.springaop.topic6_usecases.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private ReportService reportService;
    @Override
    public void run(String... args) throws Exception {
        reportService.generateSalesReport();
        reportService.generateInventoryReport();
        reportService.generateUserActivityReport();
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
