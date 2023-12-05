package entity;

import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private Long phone;
    private List<Order> orders;

    public Customer(String name, Long phone, List<Order> orders) {
        this.name = name;
        this.phone = phone;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name) && Objects.equals(phone, customer.phone) && orders.equals(customer.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, orders);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", orders=" + orders +
                '}';
    }
}
