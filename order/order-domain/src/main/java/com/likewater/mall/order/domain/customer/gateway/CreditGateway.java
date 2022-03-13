package com.likewater.mall.order.domain.customer.gateway;

import com.likewater.mall.order.domain.customer.Customer;
import com.likewater.mall.order.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
