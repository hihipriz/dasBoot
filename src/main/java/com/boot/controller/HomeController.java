package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Abuser on 4/1/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Das Boot, reporting for duty!";
    }
}
