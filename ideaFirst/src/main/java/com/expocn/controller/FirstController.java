package com.expocn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("name")
    String getName(){
        return "ligang";
    }
}
