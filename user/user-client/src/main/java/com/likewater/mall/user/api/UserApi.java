package com.likewater.mall.user.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.likewater.mall.user.dto.cmd.UserAddCmd;
import com.likewater.mall.user.dto.query.UserByIdQry;
import com.likewater.mall.user.dto.query.UserListByNameQry;
import com.likewater.mall.user.dto.data.UserDTO;

public interface UserApi {

    public Response addUser(UserAddCmd userAddCmd);

    public MultiResponse<UserDTO> listByName(UserListByNameQry userListByNameQry);

    public SingleResponse<UserDTO> getById(UserByIdQry userByIdQry);

}
