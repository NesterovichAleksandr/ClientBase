package com.nesterovich.clientbase.model.entity.product;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private Long id;
    private BigDecimal price;
}
