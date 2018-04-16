package com.mis.user.dao;

import com.mis.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by lbm on 2018/4/4.
 */
@Mapper
public interface UserDao {
    public List<User> getById(Long id);
}
