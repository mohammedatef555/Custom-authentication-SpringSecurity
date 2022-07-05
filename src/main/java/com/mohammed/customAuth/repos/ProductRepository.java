package com.mohammed.customAuth.repos;

import com.mohammed.customAuth.repos.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
