package com.nesterovich.clientbase.model.entity;

import com.nesterovich.clientbase.model.entity.product.Product;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class Order {
    private Long id;
    private LocalDate date;

    private List<Product> products;
    private BigDecimal amount;
}
