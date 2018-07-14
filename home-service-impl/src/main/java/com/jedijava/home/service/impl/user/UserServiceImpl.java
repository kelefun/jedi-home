package com.jedijava.home.service.impl.user;

import com.jedijava.crud.service.impl.AbstractBaseQueryService;
import com.jedijava.home.dao.user.UserDAO;
import com.jedijava.home.model.user.UserModel;
import com.jedijava.home.model.user.UserQuery;
import com.jedijava.home.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liukaiyang
 * @date 2018/4/3 16:44
 */
@Service("userService")
public class UserServiceImpl extends AbstractBaseQueryService<UserQuery,UserModel> implements UserService {
    @Resource
    private UserDAO userDAO;

    @Override
    public UserDAO getDAO() {
        return userDAO;
    }
}
