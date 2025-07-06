package com.kayky.shipping_cost_api_domain.service;

import com.kayky.shipping_cost_api_domain.entity.Address;
import com.kayky.shipping_cost_api_domain.entity.Freight;

public interface IFreightService {

    Freight calculateFreight(Address address);
}