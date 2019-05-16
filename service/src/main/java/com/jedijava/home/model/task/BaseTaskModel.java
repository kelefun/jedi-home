package com.jedijava.home.model.task;

import com.jedijava.base.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author liukaiyang
 * @date 2019/5/16 19:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseTaskModel extends BaseModel {
    private String taskName;
}
