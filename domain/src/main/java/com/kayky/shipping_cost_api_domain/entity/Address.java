package com.kayky.shipping_cost_api_domain.entity;

public record Address (
    String street,
    String complement,
    String district,
    String city,
    String state,
    String uf
) {}
