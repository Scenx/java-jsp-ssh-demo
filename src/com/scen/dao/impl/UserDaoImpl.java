package com.scen.dao.impl;

import com.scen.dao.UserDao;
import com.scen.domain.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @author Scen
 * @date 2018/2/9
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }
}
