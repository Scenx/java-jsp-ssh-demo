package com.scen.test;

import com.scen.domain.User;
import com.scen.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Scen
 * @date 2018/2/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AppTest {
    @Autowired
    private UserService userService;


    @Test
    public void demo1() {
        User user = new User();
        user.setUsername("小玉33");
        user.setPassword("1234");
        user.setAge(21);
        userService.register(user);
    }
}
