package com.social_credit_farming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllenController {
    @GetMapping("/allen")
    public String About() {
        return "minilabs/allen/minilabhome";
    }
}
