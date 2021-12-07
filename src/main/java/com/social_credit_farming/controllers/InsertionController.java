package com.social_credit_farming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class InsertionController {
    @GetMapping("/cb/insert")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String insert(@RequestParam(name = "value", required = false, defaultValue = "0") String value, @RequestParam(name = "index", required = false, defaultValue = "0") String index, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        int[] intArr
                = new int[] {0,1,0,1,0,1,0,1,0,1,0,1};
        String original = Arrays.toString(intArr);
        int a = Integer.parseInt(value);
        int b = Integer.parseInt(index);

        model.addAttribute("original", original); // MODEL is passed to html

        return "minilabs/insertion"; // returns HTML VIEW (greeting)
    }
}
