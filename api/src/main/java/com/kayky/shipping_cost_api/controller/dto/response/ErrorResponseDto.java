package com.kayky.shipping_cost_api.controller.dto.response;

import java.time.Instant;

public record ErrorResponseDto(
        Instant timestamp,
        String path,
        Integer status,
        String error,
        String message
) {
}
