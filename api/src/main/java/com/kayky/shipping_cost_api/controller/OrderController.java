package com.kayky.shipping_cost_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayky.shipping_cost_api.controller.dto.request.OrderRequestDto;
import com.kayky.shipping_cost_api.controller.dto.response.FreightResponseDto;
import com.kayky.shipping_cost_api.controller.mapper.FreightMapper;
import com.kayky.shipping_cost_api.controller.mapper.OrderMapper;
import com.kayky.shipping_cost_api_domain.entity.OrderWithFreight;
import com.kayky.shipping_cost_api_domain.service.OrderService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public FreightResponseDto createOrder(@RequestBody @Valid OrderRequestDto orderRequest) {
        OrderWithFreight orderWithFreight = orderService.create(OrderMapper.toEntity(orderRequest));
        return FreightMapper.toDto(orderWithFreight);
    }

    @GetMapping
    public List<FreightResponseDto> getAllOrders() {
        List<OrderWithFreight> ordersWithFreight = orderService.getAll();
        return ordersWithFreight
            .stream()
            .map(FreightMapper::toDto)
            .toList();
    }


    @GetMapping("/{id}")
    public FreightResponseDto getOrderById(@PathVariable("id") String id) {
        OrderWithFreight orderWithFreight = orderService.getById(id);
        return FreightMapper.toDto(orderWithFreight);
    }

    @GetMapping("/customer/{customerId}")
    public List<FreightResponseDto> getOrderByCustomerId(@PathVariable("customerId") String customerId) {
        List<OrderWithFreight> ordersWithFreight = orderService.getByCustomerId(customerId);
        return ordersWithFreight
            .stream()
            .map(FreightMapper::toDto)
            .toList();
    }
}
