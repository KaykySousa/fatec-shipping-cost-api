package com.kayky.shipping_cost_api.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kayky.shipping_cost_api.controller.mapper.OrderMapper;
import com.kayky.shipping_cost_api.repository.client.IOrderRepositoryMongo;
import com.kayky.shipping_cost_api.repository.orm.OrderOrm;
import com.kayky.shipping_cost_api_domain.entity.Order;
import com.kayky.shipping_cost_api_domain.repository.IOrderRepository;

@Repository
public class OrderRepositoryImpl implements IOrderRepository {

    private final IOrderRepositoryMongo repository;

    public OrderRepositoryImpl(IOrderRepositoryMongo orderRepositoryMongo) {
        this.repository = orderRepositoryMongo;
    }

    @Override
    public Order save(Order order) {
        OrderOrm orderOrm = repository.save(OrderMapper.toOrm(order));
        return OrderMapper.toEntity(orderOrm);
    }

    @Override
    public List<Order> findAll() {
        List<OrderOrm> ordersOrm = repository.findAll();
        return ordersOrm
            .stream()
            .map(OrderMapper::toEntity)
            .toList();
    }

    @Override
    public Order findById(String id) {
        OrderOrm orderOrm = repository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        return OrderMapper.toEntity(orderOrm);
    }

    @Override
    public List<Order> findByCustomerId(String customerId) {
        List<OrderOrm> ordersOrm = repository.findByCustomerId(customerId);
        return ordersOrm
            .stream()
            .map(OrderMapper::toEntity)
            .toList();
    }
    
}
