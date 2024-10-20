package com.springboot.orderdetails.Service;

import com.springboot.orderdetails.Dao.ProductDao;
import com.springboot.orderdetails.Entity.Product;
import com.springboot.orderdetails.Specification.ProductSpecification;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    ProductDao productDao;

    @Override
    public List<Product> getProductByName(String name) {

        Specification<Product> speciname= ProductSpecification.hasName(name);
        return  productDao.findAll(speciname);
    }

    @Override
    public List<Product> getProductPriceGreaterThan(long price) {

        return productDao.findAll(ProductSpecification.hasPriceGreaterThan(price));
    }
}
