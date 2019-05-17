package com.vimo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController{
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "This is pretty basic";
    }
    
    @RequestMapping("/login.html")
    public String login(){
        return "login.html";
    }

    @RequestMapping("login-error.html")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        return "login.html";
    }
}



