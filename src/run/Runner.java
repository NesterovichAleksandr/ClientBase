package run;

import entity.Customer;
import entity.Order;
import entity.product.Honey;
import entity.product.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        System.out.println(getCustomer());
    }

    public static Customer getCustomer() {
        Honey honey = new Honey(LocalDate.of(2023, 6, 8));
        List<Product> products = new ArrayList<>();
        products.add(honey);
        Order order = new Order(1L, LocalDate.now(), products, BigDecimal.valueOf(20));
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        return new Customer("Alex", 375291572087L, orders);
    }
}
