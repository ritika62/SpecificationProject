package com.springboot.orderdetails.Service;

import com.springboot.orderdetails.Entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProductByName(String name);
    public List<Product> getProductPriceGreaterThan(long price);


}