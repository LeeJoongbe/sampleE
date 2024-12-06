package com.example.demo.entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CHJController {

    @GetMapping("/chj/team")
    public String  chjGet(){

        return "chj/team";
    }

}
