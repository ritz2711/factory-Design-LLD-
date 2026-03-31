package com.factoryDesignMethod.payment.strategy;

import org.springframework.stereotype.Component;

@Component("UPI")
public class UpiPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.print("Processing UPI payment of amount: " + amount);
    }
}
