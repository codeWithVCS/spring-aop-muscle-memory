package org.chandra.springaop.topic5_pointcuts.task3;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void createOrder(String orderId){
        System.out.println("Creating order: " +orderId);
    }
    public void cancelOrder(String orderId){
        System.out.println("Cancelling order: " +orderId);
    }
    public void trackOrder(String orderId){
        System.out.println("Tracking order: " +orderId);
    }
}
