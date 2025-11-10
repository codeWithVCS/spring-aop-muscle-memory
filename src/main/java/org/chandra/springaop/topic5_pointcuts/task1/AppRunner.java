package org.chandra.springaop.topic5_pointcuts.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;
    @Override
    public void run(String... args) throws Exception {
        employeeService.addEmployee("Mark");
        employeeService.removeEmployee("Mark");
        employeeService.listEmployees();
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
