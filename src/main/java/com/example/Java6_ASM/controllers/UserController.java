package com.example.Java6_ASM.controllers;


import com.example.Java6_ASM.models.User;
import com.example.Java6_ASM.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public String getAllUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "user/user-index";
    }

}
