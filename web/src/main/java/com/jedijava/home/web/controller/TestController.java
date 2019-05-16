package com.jedijava.home.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.jedijava.common.model.ResultModel;
import com.jedijava.home.event.TestEvent;
import com.jedijava.home.model.task.ArticleTaskModel;
import com.jedijava.home.model.user.UserQuery;
import com.jedijava.home.service.task.ArticleTaskService;
import com.jedijava.home.util.SpringContextUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author liukaiyang
 * @date 2018/10/19 18:07
 */
@Log4j2
@Controller
public class TestController {
    @Resource
    ArticleTaskService articleTaskService;
    @GetMapping("/api/detail")
    @ResponseBody
    public ResultModel<JSONObject> getList(UserQuery query) {
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("id",32);
        jsonObject.put("setup","发送了什么");
        jsonObject.put("punchline","鬼知道");
        return ResultModel.success(jsonObject);
    }
    @GetMapping("/api/test")
    @ResponseBody
    public ResultModel<String> testEvent() {
        log.info("消息begin");
        ApplicationContext context=SpringContextUtil.getApplicationContext();
        context.publishEvent(new TestEvent(context,"消息发送测试"));
        log.info("消息end");
        return ResultModel.success("");
    }
    @GetMapping("/api/abstract")
    @ResponseBody
    public ResultModel<String> testAbstract() {
        ArticleTaskModel article=new ArticleTaskModel();
        article.setTaskName("文章审核");
        articleTaskService.execute(article);
        articleTaskService.audit(article);
        return ResultModel.success("");
    }
}
