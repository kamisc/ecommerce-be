package com.sewerynkamil.ecommerce.service;

import com.sewerynkamil.ecommerce.dto.PurchaseDto;
import com.sewerynkamil.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(PurchaseDto purchase);
}
