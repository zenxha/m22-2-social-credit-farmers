package com.social_credit_farming.controllers;

import com.social_credit_farming.data.FRQ;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.social_credit_farming.data.Person;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@Controller
public class AboutUs {
    @GetMapping("/about")

    public String About(Model model) throws IOException, ParseException {
        ArrayList<Person> lis = new ArrayList<>();


        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/main/resources/static/json/aboutus.json"));
        JSONObject jsonObject = (JSONObject) obj;


        for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            // Song song = new Song();
            JSONObject FRQobj = (JSONObject) jsonObject.get(key);
            lis.add(new Person((String)FRQobj.get("name"),(String)FRQobj.get("info"), (String)FRQobj.get("maskoff"), (String)FRQobj.get("maskon")));

        }
        model.addAttribute("lis", lis);
        return "homesite/about";
    }

    @GetMapping("/about/allen")
    public String AboutAllen(Model model) {
        model.addAttribute("person", "Allen");
        return "homesite/aboutallen";
    }
    @GetMapping("/about/komay")
    public String AboutKomay(Model model) {
        model.addAttribute("person", "Komay");
        return "homesite/aboutkomay";
    }

    @GetMapping("/about/tanmay")
    public String AboutTanmay(Model model) {
        model.addAttribute("person", "Tanmay");
        return "homesite/abouttanmay";
    }
    @GetMapping("/about/nick")
    public String AboutNick(Model model) {
        model.addAttribute("person", "Nicholas");
        return "homesite/aboutnick";
    }
}