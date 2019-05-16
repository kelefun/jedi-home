package com.jedijava.home.service.task;

import com.jedijava.home.model.task.ArticleTaskModel;
import com.jedijava.home.service.common.AuditAble;
import com.jedijava.home.service.common.TaskService;

/**
 * @author liukaiyang
 * @date 2019/5/16 18:55
 */
public interface ArticleTaskService extends TaskService<ArticleTaskModel>, AuditAble<ArticleTaskModel> {

}
