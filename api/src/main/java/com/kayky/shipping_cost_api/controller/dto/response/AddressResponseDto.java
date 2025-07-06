package com.kayky.shipping_cost_api.controller.dto.response;

public record AddressResponseDto(
    String street,
    String complement,
    String district,
    String city,
    String state,
    String uf
) {}
