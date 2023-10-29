package com.sewerynkamil.ecommerce.service;

import com.sewerynkamil.ecommerce.dao.CustomerRepository;
import com.sewerynkamil.ecommerce.dto.PurchaseDto;
import com.sewerynkamil.ecommerce.dto.PurchaseResponse;
import com.sewerynkamil.ecommerce.entity.Customer;
import com.sewerynkamil.ecommerce.entity.Order;
import com.sewerynkamil.ecommerce.entity.OrderItem;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

import static java.util.UUID.randomUUID;

@Service
@AllArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private final CustomerRepository customerRepository;

    @Override
    @Transactional
    public PurchaseResponse placeOrder(PurchaseDto purchase) {
        Order order = purchase.getOrder();

        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::add);

        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());

        Customer customer = purchase.getCustomer();

        String email = customer.getEmail();
        Customer customerFromDb = customerRepository.findByEmail(email);

        if (customerFromDb != null) {
            customer = customerFromDb;
        }

        customer.add(order);

        customerRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return randomUUID().toString();
    }
}
