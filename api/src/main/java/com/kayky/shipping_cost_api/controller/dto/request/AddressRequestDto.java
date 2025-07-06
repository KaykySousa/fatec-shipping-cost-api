package com.kayky.shipping_cost_api.controller.dto.request;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Validated
public record AddressRequestDto(
    
    @NotBlank
    String street,
    
    String complement,
    
    @NotBlank
    String district,
    
    @NotBlank
    String city,
    
    @NotBlank
    String state,
    
    @NotBlank
    String uf
) {
}
