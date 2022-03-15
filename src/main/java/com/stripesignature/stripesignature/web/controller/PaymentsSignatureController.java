package com.stripesignature.stripesignature.web.controller;

import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


@RestController
public class PaymentsSignatureController {

    final String YOUR_DOMAIN = "http://localhost:8080";
    @PostMapping("/create-checkout-session")
    public ResponseEntity<Object> createPaymentsSignature(@RequestBody String valor)  throws StripeException {
        SessionCreateParams params = SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.SUBSCRIPTION)
                .setSuccessUrl("http://localhost:8080/sucess")
                .setCancelUrl("http://localhost:8080/cancel")
                .addLineItem(SessionCreateParams.LineItem.builder()
                        .setQuantity(1L)
                        .setPrice("price_1Kc9loFJQfSerlwGPThPPlgg")
                        .setAdjustableQuantity(
                                SessionCreateParams.LineItem.AdjustableQuantity.builder()
                                        .setEnabled(true)
                                        .setMinimum(1L)
                                        .setMaximum(10L)
                                        .build())
                        .build())
                .build();
            Session session = Session.create(params);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setLocation(URI.create(session.getUrl()));
            return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }

    }

