package com.example.demo.payments;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTests {

    private Payment payment;

    // @BeforeEach
    // void setUp() {
    //     payment = new CreditCardPayment(10);
    // }

    @Test
    void testCreditCard() {
        payment = new CreditCardPayment(10);
        String result = payment.pay();
        assertEquals("Credit card was used to pay", result);
    }
    @Test
    void testDeliver() {
        payment = new PayPalPayment();
        String result = payment.pay();
        assertEquals("PayPal was used to pay", result);
    }
}