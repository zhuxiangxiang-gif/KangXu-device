package com.kangxu.device.mapper;

import com.kangxu.device.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: zxx
 * @create: 2020-04-14 22:03
 **/
public interface UserMapper {
    public List<User> findAll();
    public User getUser(String id);
}
