package com.kayky.shipping_cost_api.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.kayky.shipping_cost_api_domain.entity.Address;
import com.kayky.shipping_cost_api_domain.entity.Freight;
import com.kayky.shipping_cost_api_domain.service.FreightService;
import com.kayky.shipping_cost_api_domain.service.IFreightService;

@Service
public class CachedFreightService implements IFreightService {

    private final FreightService freightService;

    public CachedFreightService(FreightService freightService) {
        this.freightService = freightService;
    }

    @Override
    @Cacheable(value = "freight", key = "#address.uf()")
    public Freight calculateFreight(Address address) {
        System.out.println("CACHE WAS EXECUTED: " + address);
        return freightService.calculateFreight(address);
    }
}