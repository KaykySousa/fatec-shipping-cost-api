package com.kayky.shipping_cost_api.controller.dto.response;

import com.kayky.shipping_cost_api_domain.entity.OrderStatus;

public record OrderResponseDto(
    String id,
    String customerId,
    String customerName,
    String customerEmail,
    AddressResponseDto customerAddress,
    OrderStatus status
) {}
