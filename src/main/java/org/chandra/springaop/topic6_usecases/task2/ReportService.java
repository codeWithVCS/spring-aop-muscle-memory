package org.chandra.springaop.topic6_usecases.task2;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void generateSalesReport(){
        System.out.println("Generating sales report...");
        try{
            Thread.sleep(300);
        }catch(InterruptedException e){
            System.out.println("Report generation interrupted");
        }
    }
    public void generateInventoryReport(){
        System.out.println("Generating inventory report...");
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Report generation interrupted");
        }
    }
    public void generateUserActivityReport(){
        System.out.println("Generating user activity report...");
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            System.out.println("Report generation interrupted");
        }
    }
}
