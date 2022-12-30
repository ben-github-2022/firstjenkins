package com.bestan.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/docker",method = RequestMethod.GET)
    public String test(){
        return "docker jenkins running success....";
    }

}
