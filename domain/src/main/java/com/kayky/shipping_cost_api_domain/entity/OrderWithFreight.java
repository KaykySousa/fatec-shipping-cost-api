package com.kayky.shipping_cost_api_domain.entity;

public record OrderWithFreight(
    Order order,
    Boolean canShip,
    Double value
) {}
