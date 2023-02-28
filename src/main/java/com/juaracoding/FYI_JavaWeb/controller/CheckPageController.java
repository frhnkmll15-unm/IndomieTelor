package com.juaracoding.FYI_JavaWeb.controller;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/27/2023 8:01 PM
@Last Modified 2/27/2023 8:01 PM
Version 1.0
*/

import com.juaracoding.FYI_JavaWeb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/check")
public class CheckPageController {

    @GetMapping("/signin")
    public String pageTwo(Model model)
    {
        User users = new User();
        model.addAttribute("users",users);
        return "signin";
    }

    @GetMapping("/register")
    public String pageOne(Model model)
    {
        User users = new User();
        model.addAttribute("users",users);
        return "register";
    }

    @GetMapping("/verify")
    public String pageTwor(Model model)
    {
        model.addAttribute("email", "Paulo");
        return "verify";
    }
    @GetMapping("/index1")
    public String pageThree()
    {
        return "index_1";

    }
    @GetMapping("/styledPage")
    public String pageFour(Model model)
    {
        model.addAttribute("name", "Paulo");
        return "styledPage";
    }

    @GetMapping("/index")
    public String pageFive()
    {
        return "index";

    }



}
