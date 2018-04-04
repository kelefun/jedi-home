package com.jedijava.home.web.controller;

import com.jedijava.home.model.user.UserQuery;
import com.jedijava.home.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liukaiyang
 * @date 2018/4/3 17:27
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List getList(Model model, UserQuery query) {
       return userService.selectList(query);
    }
}
