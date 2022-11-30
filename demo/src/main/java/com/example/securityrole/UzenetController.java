package com.example.securityrole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UzenetController {
    @Autowired
    private ContentRepo contentRepo;

    @GetMapping("/uzenetlista")
    public String UzenetForm(Model model, String uzenet) {
        model.addAttribute("uzenetek", contentRepo.findAll());
        model.addAttribute("uzenet", model.getAttribute("uzenet"));
        return "uzenetlista";
    }

    @GetMapping("/uzenet")
    public String UzenetUj(Model model) {
        model.addAttribute("reg", new Content());
        return "uzenet";
    }
    @PostMapping(value="/reg_uzenet")
    public String UzenetSubmit(@ModelAttribute Content content, RedirectAttributes redirAttr) {
        contentRepo.save(content);
        redirAttr.addFlashAttribute("uzenet","Az adatbevitel sikerült");
        return "redirect:/";
    }

}
