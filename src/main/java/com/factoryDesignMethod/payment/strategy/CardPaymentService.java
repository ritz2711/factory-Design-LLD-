package com.factoryDesignMethod.payment.strategy;

import org.springframework.stereotype.Component;

@Component("Card")
public class CardPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.print("Processing Card payment of amount: " + amount);
    }
}
