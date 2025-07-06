package com.kayky.shipping_cost_api_domain.entity;

public record Freight(
    Boolean canShip,
    Double value
) {}
