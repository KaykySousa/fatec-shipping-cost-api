package com.kayky.shipping_cost_api.controller.mapper;

import com.kayky.shipping_cost_api.controller.dto.request.AddressRequestDto;
import com.kayky.shipping_cost_api.controller.dto.response.AddressResponseDto;
import com.kayky.shipping_cost_api.repository.orm.AddressOrm;
import com.kayky.shipping_cost_api_domain.entity.Address;

public class AddressMapper {
    public static Address toEntity(AddressRequestDto addressRequestDto) {
        return new Address(
            addressRequestDto.street(),
            addressRequestDto.complement(),
            addressRequestDto.district(),
            addressRequestDto.city(),
            addressRequestDto.state(),
            addressRequestDto.uf().toUpperCase()
        );
    }

    public static Address toEntity(AddressOrm addressOrm) {
        return new Address(
            addressOrm.street(),
            addressOrm.complement(),
            addressOrm.district(),
            addressOrm.city(),
            addressOrm.state(),
            addressOrm.uf().toUpperCase()
        );
    }

    public static AddressOrm toOrm(Address address) {
        return new AddressOrm(
            address.street(),
            address.complement(),
            address.district(),
            address.city(),
            address.state(),
            address.uf().toUpperCase()
        );
    }

    public static AddressResponseDto toDto(Address address) {
        return new AddressResponseDto(
            address.street(),
            address.complement(),
            address.district(),
            address.city(),
            address.state(),
            address.uf().toUpperCase()
        );
    }
}
