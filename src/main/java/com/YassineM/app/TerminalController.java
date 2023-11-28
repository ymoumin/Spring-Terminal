package com.YassineM.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TerminalController {

    @GetMapping("/terminal")
    public String sendMessage(@RequestParam(name="lg", required = true) String lg, Model model){
        model.addAttribute("lg", lg.equals("English") ? "en" : "fr");
        return "terminal";
    }
    
}


