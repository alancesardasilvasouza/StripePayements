package com.stripesignature.stripesignature;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StripeSignatureApplication {
    @Value("sk_test_51KagZWFJQfSerlwG0HHkWImEklmfRK1BQCBkp4yORL5NkrG7XyxNOKEPHGhPTXA5lWehLsaRMtVW6QiBLv3ILpnU00OZ44f6Gy")
    private String stripApikey;

    @PostConstruct
    public void setup(){
        Stripe.apiKey = stripApikey;
    }

    public static void main(String[] args) {
        SpringApplication.run(StripeSignatureApplication.class, args);
    }
}
