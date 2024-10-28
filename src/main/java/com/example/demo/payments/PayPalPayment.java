package com.example.demo.payments;

public class PayPalPayment implements Payment{

    public PayPalPayment(){
    }
    @Override
    public String pay() {
        return "PayPal was used to pay";
    }
}
