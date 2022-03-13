package com.likewater.mall.user.adapter.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.likewater.mall.user.api.UserApi;
import com.likewater.mall.user.dto.cmd.UserAddCmd;
import com.likewater.mall.user.dto.data.UserDTO;
import com.likewater.mall.user.dto.query.UserByIdQry;
import com.likewater.mall.user.dto.query.UserListByNameQry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserApi userApi;



    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to COLA 陈予墨xxxxx!";
    }

    @GetMapping(value = "/customer")
    public MultiResponse<UserDTO> listCustomerByName(@RequestParam(required = false) String name){
        UserListByNameQry userListByNameQry = new UserListByNameQry();
        userListByNameQry.setName(name);
        return userApi.listByName(userListByNameQry);
    }

    @GetMapping(value = "/getUserById")
    public SingleResponse<UserDTO> getUserById(@RequestParam(required = false) String name){
        UserByIdQry userByIdQry = new UserByIdQry();
        userByIdQry.setId(100000L);


        return userApi.getById(userByIdQry);
    }

    @PostMapping(value = "/adduser")
    public Response addCustomer(@RequestBody UserAddCmd userAddCmd){
        return userApi.addUser(userAddCmd);
    }
}
