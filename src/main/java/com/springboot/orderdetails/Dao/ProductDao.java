package com.springboot.orderdetails.Dao;

import com.springboot.orderdetails.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductDao extends JpaRepository<Product,Integer>, JpaSpecificationExecutor<Product> {
}
