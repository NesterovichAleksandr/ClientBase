package com.nesterovich.clientbase.model;

import com.nesterovich.clientbase.model.product.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order {
    private Long id;
    private LocalDate date;

    private List<Product> products;
    private BigDecimal amount;

    public Order(Long id, LocalDate date, List<Product> products, BigDecimal amount) {
        this.id = id;
        this.date = date;
        this.products = products;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id) && date.equals(order.date) && products.equals(order.products) && amount.equals(order.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, products, amount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", products=" + products +
                ", amount=" + amount +
                '}';
    }
}
