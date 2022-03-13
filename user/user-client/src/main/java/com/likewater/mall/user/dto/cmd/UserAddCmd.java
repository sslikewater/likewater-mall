package com.likewater.mall.user.dto.cmd;

import com.likewater.mall.user.dto.data.UserDTO;
import lombok.Data;

@Data
public class UserAddCmd {

    private UserDTO userDTO;

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
