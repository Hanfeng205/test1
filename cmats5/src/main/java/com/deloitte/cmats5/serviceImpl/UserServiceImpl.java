package com.deloitte.cmats5.serviceImpl;

import com.deloitte.cmats5.entity.User;
import com.deloitte.cmats5.mapper.UserMapper;
import com.deloitte.cmats5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    public UserMapper userMapper;

    @Override
    public User getUser(Long userId) {
        return userMapper.getUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
