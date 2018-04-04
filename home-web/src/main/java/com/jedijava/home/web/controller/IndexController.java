package com.jedijava.home.web.controller;

import com.jedijava.common.annotation.ResponseHtml;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liukaiyang
 * @date 2018/4/3 18:57
 */
@Controller
public class IndexController {

    @ResponseHtml
    @RequestMapping("notfound")
    public String notFound(){
        return "exception/htmlErr.html";
    }
}
