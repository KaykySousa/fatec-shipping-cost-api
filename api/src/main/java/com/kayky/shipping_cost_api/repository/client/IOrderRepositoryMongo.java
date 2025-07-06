package com.kayky.shipping_cost_api.repository.client;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kayky.shipping_cost_api.repository.orm.OrderOrm;

@Repository
public interface IOrderRepositoryMongo extends MongoRepository<OrderOrm, String> {
    public List<OrderOrm> findByCustomerId(String customerId);
}
