package com.kayky.shipping_cost_api_domain.entity;

public record Order(
    String id,
    String customerId,
    String customerName,
    String customerEmail,
    Address customerAddress,
    OrderStatus status
) {
}
