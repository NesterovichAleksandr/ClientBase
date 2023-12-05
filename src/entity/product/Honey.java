package entity.product;

import java.time.LocalDate;

public class Honey extends Product {
    private LocalDate datePumpingOut;

    public LocalDate getDatePumpingOut() {
        return datePumpingOut;
    }

    public void setDatePumpingOut(LocalDate datePumpingOut) {
        this.datePumpingOut = datePumpingOut;
    }
}
