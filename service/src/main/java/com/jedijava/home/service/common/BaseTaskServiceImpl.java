package com.jedijava.home.service.common;

import com.jedijava.home.model.task.BaseTaskModel;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/**
 * @author liukaiyang
 * @date 2019/5/16 18:40
 */
@Log4j2
@Service
public class BaseTaskServiceImpl<M extends BaseTaskModel> implements BaseTaskService<M>{

    @Override
    public void insert(M obj) {
        log.info("添加任务数据");
    }
}
