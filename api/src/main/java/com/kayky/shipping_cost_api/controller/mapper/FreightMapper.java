package com.kayky.shipping_cost_api.controller.mapper;

import com.kayky.shipping_cost_api.controller.dto.response.FreightResponseDto;
import com.kayky.shipping_cost_api_domain.entity.OrderWithFreight;

public class FreightMapper {
    public static FreightResponseDto toDto(OrderWithFreight orderWithFreight) {
        return new FreightResponseDto(
            OrderMapper.toDto(orderWithFreight.order()),
            orderWithFreight.canShip(),
            orderWithFreight.value()
        );
    }
}
