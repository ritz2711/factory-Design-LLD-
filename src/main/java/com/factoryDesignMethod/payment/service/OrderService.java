package com.factoryDesignMethod.payment.service;

import com.factoryDesignMethod.payment.factory.PaymentFactory;
import com.factoryDesignMethod.payment.strategy.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentFactory paymentFactory;

    public OrderService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public  void processPayment(String type,double amount){
        PaymentService service=paymentFactory.getPaymentService(type);
        service.pay(amount);
    }
}
