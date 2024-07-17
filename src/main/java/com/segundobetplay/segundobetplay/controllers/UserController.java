package com.segundobetplay.segundobetplay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.segundobetplay.segundobetplay.models.User;

@Controller
public class UserController {
    @Autowired
    UserRestController usuario;
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("usuarios", usuario.users);
        System.out.println(usuario.users);
        return "details";
    }
}
