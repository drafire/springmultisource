package com.drafire.springmultisource.service.impl;

import com.drafire.springmultisource.domain.Order;
import com.drafire.springmultisource.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void query() {
        Order order = orderService.query(2);
        logger.info("{}", order);
        User user = userService.query(1);
        logger.info("{}", user);
    }
}