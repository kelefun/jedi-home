package com.jedijava.home.web.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 
 * @author liukaiyang
 * @date 2018/9/29 17:57
 */
@Controller
public class SocketController {
    @Resource
    SimpMessagingTemplate simpMessagingTemplate;
    @MessageMapping("/greeting")
    public String handle(String greeting) {
        System.out.println(greeting);
        return "[" +new Date() + ": " + greeting;
    }

    @RequestMapping({"socket.html"})
    public String socketHtml(Model model) {
        return "view/socket.html";
    }
}
