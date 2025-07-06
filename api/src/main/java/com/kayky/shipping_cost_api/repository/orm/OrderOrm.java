package com.kayky.shipping_cost_api.repository.orm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kayky.shipping_cost_api_domain.entity.OrderStatus;

@Document(collection = "orders")
public record OrderOrm(
    @Id
    String id,
    @Indexed
    String customerId,
    String customerName,
    String customerEmail,
    AddressOrm customerAddress,
    OrderStatus status
) {}
