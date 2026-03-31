package com.factoryDesignMethod.payment.controller;

import com.factoryDesignMethod.payment.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment")
@RestController
public class PaymentController {

    private final OrderService orderService;

    public PaymentController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String pay(@RequestParam String type,@RequestParam double amount){
        orderService.processPayment(type,amount);
        return "Payment processed successfully";
    }
}
