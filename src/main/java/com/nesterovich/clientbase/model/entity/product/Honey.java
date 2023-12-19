package com.nesterovich.clientbase.model.entity.product;


import lombok.Data;

import java.time.LocalDate;

@Data
public class Honey extends Product {
    private LocalDate datePumpingOut;
}
