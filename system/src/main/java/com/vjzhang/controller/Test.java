package com.vjzhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class Test {

    @GetMapping("/test/one")
    public String getTestMsg() {
        return "test is ok!";
    }

}
