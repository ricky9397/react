package com.bigzone.react.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        return "hello";
    }

}
