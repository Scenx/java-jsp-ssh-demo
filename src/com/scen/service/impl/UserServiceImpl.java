package com.scen.service.impl;

import com.scen.dao.UserDao;
import com.scen.domain.User;
import com.scen.service.UserService;

/**
 * @author Scen
 * @date 2018/2/9
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }
}
