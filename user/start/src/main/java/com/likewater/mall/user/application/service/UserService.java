package com.likewater.mall.user.application.service;

import com.likewater.mall.user.dto.data.UserDTO;

import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:17 上午 2022/3/2
 */
public interface UserService {
    UserDTO getById(Long id);

    List<UserDTO> listByIds(List<Long> ids);

    int createUser(UserDTO userDO);
}
