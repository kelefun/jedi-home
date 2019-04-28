package com.jedijava.home.web.controller;

import com.jedijava.common.model.ResultModel;
import com.jedijava.home.model.user.UserModel;
import com.jedijava.home.model.user.UserQuery;
import com.jedijava.home.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liukaiyang
 * @date 2018/4/3 17:27
 */
@Slf4j
@RequestMapping("/user")
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public ResultModel getList(UserQuery query) {
        List<UserModel> userList = userService.selectList(query);
        return ResultModel.success(userList);
    }
    @GetMapping("/insert")
    @ResponseBody
    public ResultModel insert(UserModel record) {
        log.info("新增用户:{}",record);
        UserModel result = userService.insert(record);
        return ResultModel.success(result);
    }
}
