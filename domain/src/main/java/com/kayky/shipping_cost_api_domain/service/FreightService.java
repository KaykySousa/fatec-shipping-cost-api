package com.kayky.shipping_cost_api_domain.service;

import com.kayky.shipping_cost_api_domain.entity.Address;
import com.kayky.shipping_cost_api_domain.entity.Freight;

public class FreightService implements IFreightService {

    @Override
    public Freight calculateFreight(Address address) {
        switch (address.uf()) {
            case "SP", "PR":
                return new Freight(true, 0.0);
            case "RJ", "SC", "RS":
                return new Freight(true, 20.0);
            case "MG", "MT", "MS", "ES":
                return new Freight(true, 50.0);
            default:
                return new Freight(false, 0.0);
        }
    }
}
