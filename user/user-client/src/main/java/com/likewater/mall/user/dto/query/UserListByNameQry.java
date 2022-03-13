package com.likewater.mall.user.dto.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

public class UserListByNameQry extends Query{
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
