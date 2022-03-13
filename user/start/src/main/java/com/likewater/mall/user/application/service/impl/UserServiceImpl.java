package com.likewater.mall.user.application.service.impl;

import com.likewater.mall.user.application.convert.UserConvertor;
import com.likewater.mall.user.infrastructure.dao.mysql.dataobject.UserDO;
import com.likewater.mall.user.infrastructure.dao.mysql.mapper.UserMapper;
import com.likewater.mall.user.dto.data.UserDTO;
import com.likewater.mall.user.application.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:17 上午 2022/3/2
 */
@Service
public  class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDTO getById(Long id) {
        UserDO userDO =  userMapper.findById(id);

        return UserConvertor.do2DTO(userDO);
    }

    @Override
    public List<UserDTO> listByIds(List<Long> ids) {
        List<UserDO>  userDOList =  userMapper.listByIds(ids);
        return UserConvertor.doList2DTOList(userDOList);
    }

    @Override
    public int createUser(UserDTO userDTO) {
        return userMapper.insert(UserConvertor.dto2do(userDTO));
    }
}
