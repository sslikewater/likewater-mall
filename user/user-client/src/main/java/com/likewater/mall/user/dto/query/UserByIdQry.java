package com.likewater.mall.user.dto.query;

import com.alibaba.cola.dto.Query;

import lombok.Data;

@Data
public class UserByIdQry extends Query{
   private Long  id;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
