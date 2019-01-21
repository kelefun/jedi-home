package com.jedijava.home.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author liukaiyang
 * @date 2019/1/21 17:25
 */
@Component
public class AppEventPublisher {
    @Autowired
    ApplicationContext context;
    public void publish(String message) {
        context.publishEvent(new TestEvent(context, message));
    }

}
