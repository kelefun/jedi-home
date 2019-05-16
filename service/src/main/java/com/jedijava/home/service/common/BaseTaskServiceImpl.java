package com.jedijava.home.service.common;

import com.jedijava.home.model.task.BaseTaskModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author liukaiyang
 * @date 2019/5/16 18:40
 */
@Slf4j
@Service
public class BaseTaskServiceImpl<M extends BaseTaskModel> implements BaseTaskService<M>{

    @Override
    public void insert(M obj) {
        log.info("添加任务数据");
    }
}
