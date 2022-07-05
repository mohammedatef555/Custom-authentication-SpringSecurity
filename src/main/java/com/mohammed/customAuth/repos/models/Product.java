package com.mohammed.customAuth.repos.models;

import com.mohammed.customAuth.repos.enums.Currency;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    // Omitted code
}
