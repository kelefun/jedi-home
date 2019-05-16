package com.jedijava.home.service.common;

import com.jedijava.home.model.task.BaseTaskModel;

/**
 * @author liukaiyang
 * @date 2019/5/16 18:40
 */
public interface BaseTaskService<M extends BaseTaskModel> {
    void insert(M obj);
}
