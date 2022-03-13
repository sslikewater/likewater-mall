package com.likewater.mall.order.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.likewater.mall.order.dto.CustomerAddCmd;
import com.likewater.mall.order.dto.CustomerListByNameQry;
import com.likewater.mall.order.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
