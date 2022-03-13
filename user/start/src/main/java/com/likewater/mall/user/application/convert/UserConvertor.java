package com.likewater.mall.user.application.convert;

import com.likewater.mall.user.dto.data.UserDTO;
import com.likewater.mall.user.infrastructure.dao.mysql.dataobject.UserDO;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 1:00 下午 2022/3/13
 */
public class UserConvertor {

    //同名的属性用spring utils，不同名的手工转化
    public static UserDO dto2do(UserDTO userDTO) {
        if (userDTO == null) return null;

        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userDTO, userDO);

        //默认不删除记录
        userDO.setDeleted(0);

        return userDO;
    }

    public static UserDTO do2DTO(UserDO userDO) {
        if (userDO == null) return null;

        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userDO, userDTO);

        return userDTO;
    }

    public static List<UserDTO> doList2DTOList(List<UserDO> userDOList) {
        if(userDOList == null) return null;

        List<UserDTO> userDTOList = new ArrayList<>();
        userDOList.forEach(e -> {
            userDTOList.add(do2DTO(e));
        });

        return userDTOList;
    }
}