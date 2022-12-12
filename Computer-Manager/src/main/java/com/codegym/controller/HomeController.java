package com.codegym.controller;

import com.codegym.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {


    @GetMapping("/")
    public String showIndex() {
        return "redirect:/products";
    }


    @GetMapping("/login")
    public String login() {
      return  "login";
    }

    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("login");
    }

}