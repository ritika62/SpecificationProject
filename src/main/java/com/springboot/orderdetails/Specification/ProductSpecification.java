package com.springboot.orderdetails.Specification;

import com.springboot.orderdetails.Entity.Product;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class ProductSpecification {

    public static Specification<Product> hasName(String name) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("name"), name);
    }

    public static Specification<Product> hasPriceGreaterThan(double price) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThan(root.get("price"), price);
    }
}