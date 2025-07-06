package com.kayky.shipping_cost_api.controller.mapper;

import java.util.UUID;

import com.kayky.shipping_cost_api.controller.dto.request.OrderRequestDto;
import com.kayky.shipping_cost_api.controller.dto.response.OrderResponseDto;
import com.kayky.shipping_cost_api.repository.orm.OrderOrm;
import com.kayky.shipping_cost_api_domain.entity.Order;
import com.kayky.shipping_cost_api_domain.entity.OrderStatus;

public class OrderMapper {
    public static Order toEntity(OrderRequestDto orderRequestDto) {
        return new Order(
            UUID.randomUUID().toString(),
            orderRequestDto.customerId(),
            orderRequestDto.customerName(),
            orderRequestDto.customerEmail(),
            AddressMapper.toEntity(orderRequestDto.customerAddress()),
            OrderStatus.PROCESSING
        );
    }

    public static Order toEntity(OrderOrm orderOrm) {
        return new Order(
            orderOrm.id(),
            orderOrm.customerId(),
            orderOrm.customerName(),
            orderOrm.customerEmail(),
            AddressMapper.toEntity(orderOrm.customerAddress()),
            orderOrm.status()
        );
    }

    public static OrderOrm toOrm(Order order) {
        return new OrderOrm(
            order.id(),
            order.customerId(),
            order.customerName(),
            order.customerEmail(),
            AddressMapper.toOrm(order.customerAddress()),
            order.status()
        );
    }

    public static OrderResponseDto toDto(Order order) {
        return new OrderResponseDto(
            order.id(),
            order.customerId(),
            order.customerName(),
            order.customerEmail(),
            AddressMapper.toDto(order.customerAddress()),
            order.status()
        );
    }
}
