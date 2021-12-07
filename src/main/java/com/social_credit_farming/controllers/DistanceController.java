package com.social_credit_farming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class DistanceController {
    @GetMapping("/cb/distance")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String distance(@RequestParam(name = "name1", required = false, defaultValue = "0") String name1, @RequestParam(name = "name2", required = false, defaultValue = "0") String name2, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON

        int a = Integer.parseInt(name1);
        int b = Integer.parseInt(name2);
        double c = Math.sqrt(a*a + b*b);
        String s = String.valueOf(c);

        model.addAttribute("s", s); // MODEL is passed to html
        return "minilabs/distance"; // returns HTML VIEW (greeting)
    }
}
