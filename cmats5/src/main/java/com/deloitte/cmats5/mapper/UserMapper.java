package com.deloitte.cmats5.mapper;

import com.deloitte.cmats5.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUser(Long userId);

    void updateUser(User user);
}
