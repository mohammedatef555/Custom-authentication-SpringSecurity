package com.mohammed.customAuth.services;

import com.mohammed.customAuth.repos.ProductRepository;
import com.mohammed.customAuth.repos.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> finaAll() {
        return productRepository.findAll();
    }
}
