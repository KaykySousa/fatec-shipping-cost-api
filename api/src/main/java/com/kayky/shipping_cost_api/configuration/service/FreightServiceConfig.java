package com.kayky.shipping_cost_api.configuration.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kayky.shipping_cost_api_domain.service.FreightService;

@Configuration
public class FreightServiceConfig {

    @Bean
    public FreightService freightService() {
        return new FreightService();
    }
}