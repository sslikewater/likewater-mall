package com.likewater.mall.user.test;


import com.likewater.mall.user.Application;
import com.likewater.mall.user.application.service.UserService;
import com.likewater.mall.user.dto.data.UserDTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = Application.class)
class UserServiceTest {
    @Autowired
    UserService userService;


    @Test
    @Transactional
    @Rollback(true)
    void testGetById() {

        //插入一条id = 1的user
        UserDTO ud = new UserDTO();
        ud.setId(10001L);
        ud.setEmail("cc@qq.com");
        ud.setGmtCreate(new Date());
        ud.setGmtModified(new Date());
        ud.setIdCardNo("31018987655554");
        ud.setMobile("13888888888");
        ud.setName("jack");
        ud.setStatus(1);
        ud.setUserName("jackchen");

        userService.createUser(ud);

        //根据id查询
        UserDTO userDO = userService.getById(10001L);
        Assertions.assertTrue(userDO.getId()==10001L);
        System.out.println(userDO.toString());

    }

    @Test
    @Transactional
    @Rollback(true)
    void testGetByIds() {

        //插入一条id = 1的user
        UserDTO ud = new UserDTO();
        ud.setId(10001L);
        ud.setEmail("cc@qq.com");
        ud.setGmtCreate(new Date());
        ud.setGmtModified(new Date());
        ud.setIdCardNo("31018987655554");
        ud.setMobile("13888888888");
        ud.setName("jack");
        ud.setStatus(1);
        ud.setUserName("jackchen");
        userService.createUser(ud);


        UserDTO ud1 = new UserDTO();
        ud1.setId(10002L);
        ud1.setEmail("cc@qq.com");
        ud1.setGmtCreate(new Date());
        ud1.setGmtModified(new Date());
        ud1.setIdCardNo("31018987655554");
        ud1.setMobile("13888888888");
        ud1.setName("jack");
        ud1.setStatus(1);
        ud1.setUserName("jackchen");

        userService.createUser(ud1);


        List<Long> ids = new ArrayList<>();
        ids.add(10001L);
        ids.add(10002L);

        List<UserDTO> userList = userService.listByIds(ids);
        Assertions.assertTrue(userList.size()==2);

        if(userList != null){
            userList.forEach(e->{
                System.out.println(e.toString());
            });
        }
    }

}
