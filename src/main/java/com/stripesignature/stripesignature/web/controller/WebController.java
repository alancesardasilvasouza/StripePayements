package com.stripesignature.stripesignature.web.controller;

import com.stripesignature.stripesignature.model.StoreItems;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class WebController {
    @Value("stripe.Public.key")
    private String stripePublickey;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("storeItems", new StoreItems());
        return "index";
    }
    @PostMapping("/")
    public String checkout(@ModelAttribute @Valid StoreItems storeItems, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        model.addAttribute("stripePublickey", stripePublickey);
        model.addAttribute("valor", storeItems.getValor());
        model.addAttribute("nameProduct", storeItems.getNameProduct());
        return "checkout";
    }
    @GetMapping("/cancel")
    public String cancel(Model model) {
        return "cancel";
    }
    @GetMapping("/sucess")
    public String sucess(Model model) {
        return "sucess";
    }
}