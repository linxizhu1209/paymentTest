package org.example.paymenttest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/commerce/home")
public class HomeController {


    @GetMapping
    public String home(){
        return "home";
    }

}
