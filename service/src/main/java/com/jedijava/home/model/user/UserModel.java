package com.jedijava.home.model.user;


import com.jedijava.base.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author liukaiyang
 * @date 2018/4/3 15:12
 */
public class UserModel extends BaseModel {
    private String username;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
