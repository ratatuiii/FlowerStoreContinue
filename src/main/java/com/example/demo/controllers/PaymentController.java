package com.example.demo.controllers;

import com.example.demo.payments.CreditCardPayment;
// import com.example.demo.payments.PayPalPayment;
import com.example.demo.payments.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaymentController {
    private List<Payment> payments;
    public PaymentController() {
        payments = new ArrayList<>();
        payments.add(new CreditCardPayment(40));
        payments.add(new CreditCardPayment(40));
    }

    public void addPayment(Payment payment) {payments.add(payment);}

    @RequestMapping("/payments")
    public List<Payment> getPayments() {
        return payments;
    }
}
