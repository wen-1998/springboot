package com.wen.springboot.service;


import com.wen.springboot.entity.User;
import com.wen.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(int id) {
        return (User) userMapper.getUserInfo(id);
    }


    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    public int Update(User user) {
        return userMapper.update((User) user);
    }

    public User save(User user) {
        int save = userMapper.save((User) user);
        return user;
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}