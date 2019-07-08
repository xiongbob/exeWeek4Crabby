package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/test")
    public String testPage(){
        return "test";
    }

    @RequestMapping("/crabby")
    public String crabbyPage(){
        return "crabby";
    }

}
