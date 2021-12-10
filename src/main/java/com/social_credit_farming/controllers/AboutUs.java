package com.social_credit_farming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUs {
    @GetMapping("/about")
    public String About() {
        return "homesite/about";
    }

    @GetMapping("/about/allen")
    public String AboutAllen() {
        return "homesite/aboutallen";
    }
}