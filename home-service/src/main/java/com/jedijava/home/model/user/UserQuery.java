package com.jedijava.home.model.user;

import com.jedijava.base.model.PageModel;

/**
 * @author liukaiyang
 * @date 2018/4/3 16:52
 */
public class UserQuery extends PageModel {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
