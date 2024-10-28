package com.example.demo.payments;

public class CreditCardPayment implements Payment {
    public CreditCardPayment(int i){
    }
    @Override
    public String pay() {
        return "Credit card was used to pay";
    }
}
