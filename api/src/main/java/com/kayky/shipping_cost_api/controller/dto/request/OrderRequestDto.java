package com.kayky.shipping_cost_api.controller.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OrderRequestDto(
    
    @NotBlank
    String customerId,

    @NotBlank
    String customerName,

    @NotBlank
    String customerEmail,

    @NotNull
    @Valid
    AddressRequestDto customerAddress
) {
}
