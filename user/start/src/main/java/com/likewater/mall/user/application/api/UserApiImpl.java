package com.likewater.mall.user.application.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.likewater.mall.user.api.UserApi;
import com.likewater.mall.user.dto.cmd.UserAddCmd;
import com.likewater.mall.user.dto.query.UserByIdQry;
import com.likewater.mall.user.dto.query.UserListByNameQry;
import com.likewater.mall.user.dto.data.UserDTO;
import com.likewater.mall.user.application.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
//@CatchAndLog
public class UserApiImpl implements UserApi {

    @Resource
    private UserService userService;
//
//    @Resource
//    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addUser(UserAddCmd userAddCmd) {
//        return customerAddCmdExe.execute(customerAddCmd);
        return null;
    }

    @Override
    public MultiResponse<UserDTO> listByName(UserListByNameQry userListByNameQry) {
//        return customerListByNameQryExe.execute(customerListByNameQry);
        return null;
    }

    @Override
    public SingleResponse<UserDTO> getById(UserByIdQry userByIdQry) {
        SingleResponse response = SingleResponse.buildSuccess();
        response.setData(userService.getById(userByIdQry.getId()));
        return response;
    }

}