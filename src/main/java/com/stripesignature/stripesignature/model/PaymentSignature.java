package com.stripesignature.stripesignature.model;

public class PaymentSignature {

    private String valor;

    public PaymentSignature(){
    }

    public PaymentSignature(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
