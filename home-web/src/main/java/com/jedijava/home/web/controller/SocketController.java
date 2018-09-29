package com.jedijava.home.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author liukaiyang
 * @date 2018/9/29 17:57
 */
@Controller
public class SocketController {

    @RequestMapping({"socket.html"})
    public String socketHtml(Model model) {
        return "view/socket.html";
    }
}
