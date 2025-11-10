package org.chandra.springaop.topic4_aspect_definition.task1;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void sendEmail(String recipient){
        System.out.println("Sending email to: " + recipient);
    }
    public void sendSMS(String number){
        System.out.println("Sending Sms to: " + number);
    }
}
