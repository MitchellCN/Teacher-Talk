package com.forestnewark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for Login page
 */
@Controller
public class LoginController {


    @RequestMapping("/")
    public String login(){
        return "login";
    }

}
