package org.chandra.springaop.topic6_usecases.task4;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment(double amount) throws Exception{
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid amount");
        }
        else {
            System.out.println("Processing payment of: " + amount);
        }
    }
    public void refundPayment(String transactionId)throws Exception{
        if(transactionId == null || transactionId.isEmpty()){
            throw new RuntimeException("Invalid transaction ID");
        }else{
            System.out.println("Refund initiated for transaction: " + transactionId);
        }
    }
}
