package com.jedijava.home.service.common;

import com.jedijava.home.model.task.BaseTaskModel;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author liukaiyang
 * @date 2019/5/16 18:50
 */
@Log4j2
public abstract class AbstractTaskServiceImpl<M extends BaseTaskModel> implements TaskService<M> {

    private Class<M> clazz;
    private Boolean auditAble;

    public AbstractTaskServiceImpl() {
        auditAble=this instanceof AuditAble;
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;

            Type type = parameterizedType.getActualTypeArguments()[0];
            if (type instanceof Class<?>) {
                clazz = (Class<M>) type;
            }
        }
    }
    protected abstract String getUrl();
    @Override
    public void create(M obj) {
        log.info("创建任务");
    }
    @Override
    public void accept(M obj) {
        log.info("接受任务");
    }
    @Override
    public void execute(M obj) {
        log.info("执行任务");
        if(auditAble){
            log.info("需要审核");
        }
    }
}
