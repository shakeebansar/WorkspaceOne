package com.sx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootOneController {

    @GetMapping("/boot/{value}")
    public String getBootOne(@PathVariable("value") String value) {
        return "Value: " + value;
    }

    @GetMapping("/boot")
    public String getBoot() {
        return "BootOne: Take2";
    }

}
