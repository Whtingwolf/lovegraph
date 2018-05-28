package com.withing.lovegraph.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class SampleController {
    @RequestMapping("/index")
    public String indexPage(){
        return "index";
    }

}
    