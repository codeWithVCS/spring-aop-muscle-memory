package org.chandra.springaop.topic4_aspect_definition.task1;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotificationAspect {
    static{
        System.out.println("[INIT] NotificationAspect initialized and loaded by Spring");
    }
}
