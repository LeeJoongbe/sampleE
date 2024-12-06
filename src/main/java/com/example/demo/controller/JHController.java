package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class JHController {

    @GetMapping("/team/jhcon")
    public String jh(){

        log.info("hi");
        return "team/jhcon";
    }

}
