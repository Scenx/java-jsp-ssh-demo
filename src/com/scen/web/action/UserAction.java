package com.scen.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.scen.domain.User;
import com.scen.service.UserService;

/**
 * @author Scen
 * @date 2018/2/10
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user;

    @Override
    public User getModel() {
        return user;
    }

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 用户注册
     * @return
     */
    public String register() {
        userService.register(user);
        return "success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
