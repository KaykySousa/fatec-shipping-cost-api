package com.kayky.shipping_cost_api.controller.dto.response;

public record FreightResponseDto(
    OrderResponseDto order,
    Boolean canShip,
    Double freightValue
) {}
