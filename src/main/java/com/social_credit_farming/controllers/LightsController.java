package com.social_credit_farming.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class LightsController {
    @GetMapping("/Lights")
    public String LightsPage() {
        return "homesite/Lights";
    }
}