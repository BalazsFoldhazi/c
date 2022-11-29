package com.example.securityrole;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UzenetController {
    @GetMapping("/urlap")
    public String urlapForm(Model model) {
        model.addAttribute("uzenet", new Uzenet());
        return "urlap";
    }

    @PostMapping("/eredmeny")
    public String urlapSubmit(@Valid @ModelAttribute Uzenet uzenet, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors())
            return "urlap";
        model.addAttribute("attr2", uzenet);
        return "eredmeny";
    }
}
