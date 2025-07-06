package com.kayky.shipping_cost_api.configuration.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kayky.shipping_cost_api.service.CachedFreightService;
import com.kayky.shipping_cost_api_domain.repository.IOrderRepository;
import com.kayky.shipping_cost_api_domain.service.OrderService;

@Configuration
public class OrderServiceConfig {

    @Bean
    public OrderService orderService(
        IOrderRepository orderRepository,
        CachedFreightService cachedFreightService
    ) {
        return new OrderService(
            orderRepository,
            cachedFreightService
        );
    }
}
