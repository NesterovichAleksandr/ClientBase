package entity;

import entity.product.Product;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private LocalDate date;

    private List<Product> products;
    private short amount;

}
