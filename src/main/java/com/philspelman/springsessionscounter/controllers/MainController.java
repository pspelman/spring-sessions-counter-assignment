package com.philspelman.springsessionscounter.controllers;


import org.springframework.context.annotation.Scope;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@Scope("session")
public class MainController {

    //    @RequestMapping("/")
//    String index(Model model) {
//        model.addAttribute("titleString", "Welcome to the counter page");
//        model.addAttribute("count", count())
//        return "counter";
//    }
    @RequestMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("count") == null) {
            System.out.println("count was null...setting 0");

            session.setAttribute("count", 0);
        } else {
            System.out.println("adding 1 to the counter");
            session.setAttribute("count", ((Integer) (session.getAttribute("count"))) + 1);
        }

        Integer count = (Integer)session.getAttribute("count");

//        model.addAttribute("titleString", "this is the count message");

        return "index";
    }

    @RequestMapping("/counter")
    public String counter(Model model) {
        model.addAttribute("titleString", "Counter Title String");

        return "counter";
    }

}
