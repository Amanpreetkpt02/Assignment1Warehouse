package com.cpan252.Warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
/**
 * This mapping shows that all reqeuest to 
 * the server will be mapped to this controller
 */
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String about() {
        return "home";
    }
    
}
