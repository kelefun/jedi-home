package com.jedijava.home.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.jedijava.common.model.ResultModel;
import com.jedijava.home.model.user.UserQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liukaiyang
 * @date 2018/10/19 18:07
 */
@Controller
public class TestController {
    @GetMapping("/api/detail")
    @ResponseBody
    public ResultModel getList(UserQuery query) {
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("id",32);
        jsonObject.put("setup","发送了什么");
        jsonObject.put("punchline","鬼知道");
        return ResultModel.success(jsonObject);
    }
}
