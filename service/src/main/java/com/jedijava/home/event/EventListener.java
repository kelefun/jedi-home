package com.jedijava.home.event;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author liukaiyang
 * @date 2019/1/21 17:29
 */
@Log4j2
@Component
public class EventListener {
    @Async
    @TransactionalEventListener
    @Transactional
    public void handle(TestEvent event) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("监听到提交事件={}",event.getObj());
    }
}
