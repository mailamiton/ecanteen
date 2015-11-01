package com.np.init.controller;


import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.np.model.entity.User;

@Controller
@Transactional
public class initcontroller {
	@Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/login")
    public String login() {
    	System.out.println("Hello MediaCenter!!");
    	User usr = new User();
    	//usr.setId(1);
    	usr.setUserName("amit");
    	usr.setPassword("amit");
    	usr.setCreatedDt(new Date());
    	usr.setLastUpdDate(new Date());
//    	usr.setUserId(usr);
		sessionFactory.getCurrentSession().save(usr);
    	
        return "login";
    }
    
    @RequestMapping("/*")
    public String rest() {
    	System.out.println("Hello Rest!!");
        return "rest";
    }
}
