package com.ndangduc.bn.configspringboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ducnd")
public class BeanController {

    @RequestMapping(value = "/test-bean", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String testBean(){
        return "Hello World";
    }
}
