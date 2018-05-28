package com.withing.lovegraph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NavigationController {
    @RequestMapping("/index")
    public String indexPage(){
        return "index";
    }
    @RequestMapping("/myMessage")
    public String myPage(){
        return "myMessage";
    }

    @RequestMapping("/explore")
    public String explorePage(){
        return "explore";
    }



}
    