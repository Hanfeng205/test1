package com.deloitte.cmats5.mapper;

import com.deloitte.cmats5.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void getUserTest(){
        User user = userMapper.getUser(Long.valueOf(2));
        System.out.println(user.getUser_name());
    }
}
