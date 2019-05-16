package com.jedijava.home.service.common;

import com.jedijava.home.model.task.BaseTaskModel;

/**
 * 审核功能
 * 继承此接口即表明具有审核节点和审核功能
 * @author liukaiyang
 * @date 2019/5/16 18:39
 */
public interface AuditAble<T extends BaseTaskModel> {
    BaseTaskService<T> getBaseService();

    default void audit(T obj) {
        BaseTaskService<T> service = this.getBaseService();
        service.insert(obj);
    }
}
