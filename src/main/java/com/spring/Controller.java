package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/one")
    public int getNumberOne() {
        return 1;
    }

    @GetMapping(path = "/two")
    public int getNumberTwo() {
        return 2;
    }

    @GetMapping(path = "/three")
    public int getNumberThree() {
        return 3;
    }
}
