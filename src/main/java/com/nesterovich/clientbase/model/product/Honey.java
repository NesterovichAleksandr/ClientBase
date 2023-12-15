package com.nesterovich.clientbase.model.product;

import java.time.LocalDate;
import java.util.Objects;

public class Honey extends Product {
    private LocalDate datePumpingOut;

    public Honey(LocalDate datePumpingOut) {
        this.datePumpingOut = datePumpingOut;
    }

    public LocalDate getDatePumpingOut() {
        return datePumpingOut;
    }

    public void setDatePumpingOut(LocalDate datePumpingOut) {
        this.datePumpingOut = datePumpingOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Honey honey = (Honey) o;
        return Objects.equals(datePumpingOut, honey.datePumpingOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), datePumpingOut);
    }

    @Override
    public String toString() {
        return "Honey{" +
                "datePumpingOut=" + datePumpingOut +
                '}';
    }
}
