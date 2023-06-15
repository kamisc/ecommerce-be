package com.sewerynkamil.ecommerce.dao;

import com.sewerynkamil.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
