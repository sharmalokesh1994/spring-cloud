package com.lok.multifieldsearch.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private String price;

    @Column(name = "discounted_price")
    private String discounted_price;

    @Column(name = "description")
    private String description;

    @Column(name = "brand")
    private String brand;


}
