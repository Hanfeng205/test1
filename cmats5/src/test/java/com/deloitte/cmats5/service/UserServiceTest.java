package com.deloitte.cmats5.service;

import com.deloitte.cmats5.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    //private static Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Test
    public void userServiceTest() {
        User user = userService.getUser(Long.valueOf(2));
        System.out.println(user.getUser_name());

        /*logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");*/

    }

}
