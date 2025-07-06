package com.kayky.shipping_cost_api_domain.service;

import java.util.List;

import com.kayky.shipping_cost_api_domain.entity.Freight;
import com.kayky.shipping_cost_api_domain.entity.Order;
import com.kayky.shipping_cost_api_domain.entity.OrderWithFreight;
import com.kayky.shipping_cost_api_domain.repository.IOrderRepository;

public class OrderService {

    public final IOrderRepository orderRepository;
    public final IFreightService freightService;

    public OrderService(
        IOrderRepository orderRepository,
        IFreightService freightService
    ) {
        this.orderRepository = orderRepository;
        this.freightService = freightService;
    }

    public OrderWithFreight create(Order order) {
        Order newOrder = orderRepository.save(order);
        Freight freight = freightService.calculateFreight(order.customerAddress());
        
        return new OrderWithFreight(
            newOrder,
            freight.canShip(),
            freight.value()
        );
    }

    public List<OrderWithFreight> getAll() {
        List<Order> orders = orderRepository.findAll();
        return orders
            .stream()
            .map(order -> {
                Freight freight = freightService.calculateFreight(order.customerAddress());
                return new OrderWithFreight(
                    order,
                    freight.canShip(),
                    freight.value()
                );
            })
            .toList();
    }

    public OrderWithFreight getById(String id) {
        Order order = orderRepository.findById(id);
        Freight freight = freightService.calculateFreight(order.customerAddress());
        
        return new OrderWithFreight(
            order,
            freight.canShip(),
            freight.value()
        );
    }

    public List<OrderWithFreight> getByCustomerId(String customerId) {
        List<Order> orders = orderRepository.findByCustomerId(customerId);
        return orders
            .stream()
            .map(order -> {
                Freight freight = freightService.calculateFreight(order.customerAddress());
                return new OrderWithFreight(
                    order,
                    freight.canShip(),
                    freight.value()
                );
            })
            .toList();

    }
}
