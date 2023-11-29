package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestServer {
    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "hello springboot------test branches";
    }
}
