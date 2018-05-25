package com.withing.lovegraph.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/hello")
    public String hello(){return "index.html";}
}
