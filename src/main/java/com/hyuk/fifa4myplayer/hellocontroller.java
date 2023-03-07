package com.hyuk.fifa4myplayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class hellocontroller {
    @GetMapping("test")
    public String test() {
        return "hello World";
    }
}
