package entity;

import entity.product.Product;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private LocalDate date;

    private List<Product> products;
    private short amount;

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

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }
}
