package com.mis.user.dao;

import com.mis.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lbm on 2018/4/4.
 */
@Mapper
public interface UserDao {

    public User getById(long id);
}
