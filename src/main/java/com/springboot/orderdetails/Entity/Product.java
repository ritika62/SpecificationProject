package com.springboot.orderdetails.Entity;

import jakarta.persistence.*;
import lombok.*;




@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productTable")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Integer pid;
    private String name;
    private long price;
}