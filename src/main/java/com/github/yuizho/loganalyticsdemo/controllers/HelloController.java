package com.github.yuizho.loganalyticsdemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("hello")
    public String hello() {
        logger.info("hello!!!");
        return "hello";
    }
}
