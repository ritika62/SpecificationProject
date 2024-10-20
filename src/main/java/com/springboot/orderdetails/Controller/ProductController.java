package com.springboot.orderdetails.Controller;

import com.springboot.orderdetails.Entity.Product;
import com.springboot.orderdetails.Service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    ProductService productService;

    @GetMapping("/getProductByName/{name}")
    public List<Product> getProductByName(String name){
        return productService.getProductByName(name);

    }

    @GetMapping("/getProductPriceGreaterThan/{price}")
    public List<Product> getProductPriceGreaterThan(long price){
        return productService.getProductPriceGreaterThan(price);


    }

}
