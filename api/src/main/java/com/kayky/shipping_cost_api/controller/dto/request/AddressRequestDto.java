package com.kayky.shipping_cost_api.controller.dto.request;

public record AddressRequestDto(
    String street,
    String complement,
    String district,
    String city,
    String state,
    String uf
) {
}
