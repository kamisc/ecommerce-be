package com.sewerynkamil.ecommerce.dao;

import com.sewerynkamil.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("${allowed.page}")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
