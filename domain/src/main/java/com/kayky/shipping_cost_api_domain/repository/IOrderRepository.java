package com.kayky.shipping_cost_api_domain.repository;

import java.util.List;

import com.kayky.shipping_cost_api_domain.entity.Order;

public interface IOrderRepository {

    public Order save(Order order);
    public List<Order> findAll();
    public Order findById(String id);
    public List<Order> findByCustomerId(String customerId);
    
}
