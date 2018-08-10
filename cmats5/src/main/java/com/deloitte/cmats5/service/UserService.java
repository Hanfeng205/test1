package com.deloitte.cmats5.service;

import com.deloitte.cmats5.entity.User;

public interface UserService {
    User getUser(Long userId);

    void updateUser(User user);
}
