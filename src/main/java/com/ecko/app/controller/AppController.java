package com.ecko.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "app-services")
public class AppController {

    Logger logger = LoggerFactory.getLogger(AppController.class);

    @Value("${salam.message}")
    private String salam;

    @GetMapping(value = "/")
    String index() {
        logger.info(salam);
        return salam;
    }

}
