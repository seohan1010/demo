package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {



    @RequestMapping(path="/data",method= RequestMethod.GET)
    public List<String> retriveDemoData() {

        String[] str = {"1234", "1324", "1324", "2134", "1324"};

        List list = Arrays.asList(str);

        return list;
    }


}
