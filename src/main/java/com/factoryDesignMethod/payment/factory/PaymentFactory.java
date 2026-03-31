package com.factoryDesignMethod.payment.factory;

import com.factoryDesignMethod.payment.strategy.PaymentService;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactory {

    private final Map<String, PaymentService> paymentServices;

    public PaymentFactory(Map<String, PaymentService> paymentServices) {
        this.paymentServices = paymentServices;
    }

    public PaymentService getPaymentService(String type){
        PaymentService paymentService = paymentServices.get(type);
        if(paymentService == null){
            throw new IllegalArgumentException("Invalid payment type: " + type);
        }
        return paymentService;
    }
}
