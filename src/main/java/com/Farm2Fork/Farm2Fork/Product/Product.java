package com.Farm2Fork.Farm2Fork.Product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    @Column(length = 200)
    private String name;

    @Column(length = 200)
    private String SKU;

    @Column
    private Float price;

    @Column
    private Integer quantity;
}
