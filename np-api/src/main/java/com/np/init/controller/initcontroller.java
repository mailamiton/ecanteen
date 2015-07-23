package com.np.init.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class initcontroller {

    @RequestMapping("/login")
    public String login() {
    	System.out.println("Hello MediaCenter!!");
        return "login";
    }
    
    @RequestMapping("/*")
    public String rest() {
    	System.out.println("Hello Rest!!");
        return "rest";
    }
}
