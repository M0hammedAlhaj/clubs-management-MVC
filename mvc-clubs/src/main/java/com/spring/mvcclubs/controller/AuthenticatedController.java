package com.spring.mvcclubs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticatedController {

    @GetMapping("/layout")
    public String layout() {
        return "layout";
    }

}
