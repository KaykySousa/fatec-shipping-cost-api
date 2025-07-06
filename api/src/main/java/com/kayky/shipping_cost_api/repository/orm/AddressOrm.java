package com.kayky.shipping_cost_api.repository.orm;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addresses")
public record AddressOrm(
    String street,
    String complement,
    String district,
    String city,
    String state,
    String uf
) {}
