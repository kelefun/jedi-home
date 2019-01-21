package com.jedijava.home.web.controller;

import com.jedijava.common.annotation.ResponseHtml;
import com.jedijava.common.exception.WebException;
import com.jedijava.common.result.DefaultResultCode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liukaiyang
 * @date 2018/4/3 18:57
 */
@Controller
public class IndexController {

    @ResponseHtml
    @RequestMapping("notfound")
    public String notFound(Model model) {
        throw new WebException(DefaultResultCode.REQUEST_ERROR_NOT_FIND);
//        ResultModel result= ResultModel.error(DefaultResultCode.REQUEST_ERROR_NOT_FIND);
//        model.addAttribute("result",result);
//        return "exception/jsonErr.ftl";
    }

    @RequestMapping({"/", "/index.html"})
    public String index(Model model) {
        return "view/login.html";
    }
}
