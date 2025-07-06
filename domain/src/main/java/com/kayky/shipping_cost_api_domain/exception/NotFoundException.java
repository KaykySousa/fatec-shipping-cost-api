package com.kayky.shipping_cost_api_domain.exception;


public class NotFoundException extends RuntimeException{
    
    public NotFoundException(String message) {
        super(message);
    }
}
