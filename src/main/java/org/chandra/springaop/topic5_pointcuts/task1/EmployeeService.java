package org.chandra.springaop.topic5_pointcuts.task1;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    public void addEmployee(String name){
        System.out.println("Adding employee: " + name);
    }
    public void removeEmployee(String name){
        System.out.println("Removing employee: " + name);
    }
    public void listEmployees(){
        System.out.println("Listing all employees");
    }
}
