package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping(value = {"/login" , "/"}) // either one of these will result in landing on the login page
    public String login(){
         return "login";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";

    }



}
