package com.jedijava.home.service.task;

import com.jedijava.home.model.task.ArticleTaskModel;
import com.jedijava.home.service.common.AbstractTaskServiceImpl;
import com.jedijava.home.service.common.BaseTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liukaiyang
 * @date 2019/5/16 18:55
 */
@Service
public class ArticleTaskServiceImpl extends AbstractTaskServiceImpl<ArticleTaskModel> implements ArticleTaskService {

    @Resource
    BaseTaskService<ArticleTaskModel> baseTaskService;

    @Override
    protected String getUrl() {
        return "https://baidu.com";
    }

    @Override
    public BaseTaskService<ArticleTaskModel> getBaseService() {
        return baseTaskService;
    }
}
