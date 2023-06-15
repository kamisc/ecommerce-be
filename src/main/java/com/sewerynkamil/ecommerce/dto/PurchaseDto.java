package com.sewerynkamil.ecommerce.dto;

import com.sewerynkamil.ecommerce.entity.Address;
import com.sewerynkamil.ecommerce.entity.Customer;
import com.sewerynkamil.ecommerce.entity.Order;
import com.sewerynkamil.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class PurchaseDto {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
