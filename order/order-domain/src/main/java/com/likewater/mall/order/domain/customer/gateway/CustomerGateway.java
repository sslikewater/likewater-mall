package com.likewater.mall.order.domain.customer.gateway;

import com.likewater.mall.order.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
