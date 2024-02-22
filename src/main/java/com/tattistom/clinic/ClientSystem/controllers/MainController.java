package com.tattistom.clinic.ClientSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Yerassyl");
        return "Home";
    }

}