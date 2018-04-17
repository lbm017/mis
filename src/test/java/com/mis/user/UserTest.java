package com.mis.user;

import com.mis.Start;
import com.mis.user.entity.User;
import com.mis.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by lbm on 2018/4/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Start.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserByIdTest(){
        Long id=1l;
        User user = userService.getUserById(id);
        System.out.println(user.getRealName());
    }
}
