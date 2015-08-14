package com.np.init.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.np.model.entity.User;

@Controller
public class initcontroller {

    @RequestMapping("/login")
    public String login() {
    	System.out.println("Hello MediaCenter!!");
    	User usr = new User();
        return "login";
    }
    
    @RequestMapping("/*")
    public String rest() {
    	System.out.println("Hello Rest!!");
        return "rest";
    }
}
