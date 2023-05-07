package com.sewerynkamil.ecommerce.dao;

import com.sewerynkamil.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
