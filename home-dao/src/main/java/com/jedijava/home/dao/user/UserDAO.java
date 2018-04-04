package com.jedijava.home.dao.user;

import com.jedijava.crud.dao.BaseQueryDAO;
import com.jedijava.home.model.user.UserModel;
import com.jedijava.home.model.user.UserQuery;
import org.springframework.stereotype.Repository;

/**
 * @author liukaiyang
 * @date 2018/4/3 16:51
 */
@Repository
public interface UserDAO extends BaseQueryDAO<UserQuery,UserModel> {
}
