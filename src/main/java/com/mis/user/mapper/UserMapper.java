package com.mis.user.mapper;

import com.mis.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by lbm on 2018/4/3.
 */
@Mapper
public interface UserMapper {
    public User getById(Long id);
}
