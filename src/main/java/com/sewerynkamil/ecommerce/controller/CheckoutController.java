package com.sewerynkamil.ecommerce.controller;

import com.sewerynkamil.ecommerce.dto.PurchaseDto;
import com.sewerynkamil.ecommerce.dto.PurchaseResponse;
import com.sewerynkamil.ecommerce.service.CheckoutService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
@AllArgsConstructor
public class CheckoutController {
    private CheckoutService checkoutService;

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody PurchaseDto purchaseDto) {
        return checkoutService.placeOrder(purchaseDto);
    }



}
