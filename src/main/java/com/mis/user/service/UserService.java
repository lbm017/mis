package com.mis.user.service;

import com.mis.user.dao.UserDao;
import com.mis.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lbm on 2018/4/16.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserById(Long id){
        return userDao.getById(id);
    }
}
