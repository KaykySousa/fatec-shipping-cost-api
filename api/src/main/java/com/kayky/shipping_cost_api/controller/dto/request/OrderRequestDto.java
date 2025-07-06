package com.kayky.shipping_cost_api.controller.dto.request;

public record OrderRequestDto(
    String customerId,
    String customerName,
    String customerEmail,
    AddressRequestDto customerAddress
) {
}
