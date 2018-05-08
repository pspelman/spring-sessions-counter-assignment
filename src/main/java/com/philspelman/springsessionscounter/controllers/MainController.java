package com.philspelman.springsessionscounter.controllers;


import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("titleString", "Welcome to the counter page");

        return "counter";
    }
//    @RequestMapping("/")
//    String index(Session session) {
//
//
//        return "counter";
//    }
}
