package com.stripesignature.stripesignature.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StoreItems {
     @NotNull
     @Size(min = 5, max = 25)
     private String nameProduct = "zApi";
     @NotNull
     @Min(4)
     private Integer valor = 99;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
