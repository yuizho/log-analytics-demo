package com.github.yuizho.loganalyticsdemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.random.RandomGenerator;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("hello")
    public String hello() {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(RandomGenerator.getDefault().nextInt(500));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        MDC.put("latency", String.valueOf(end - start));
        MDC.put("id", String.valueOf(RandomGenerator.getDefault().nextInt(10000)));

        logger.info("Hello!! my job was finished!!");

        MDC.remove("latency");
        MDC.remove("id");
        return "hello";
    }
}
