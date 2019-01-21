package com.jedijava.home.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 *
 * @author liukaiyang
 * @date 2019/1/21 15:17
 */
public class TestEvent extends ApplicationContextEvent {
    private Object obj;
    public TestEvent(ApplicationContext source,Object obj) {
        super(source);
        this.obj=obj;
    }

    public Object getObj() {
        return obj;
    }
}
