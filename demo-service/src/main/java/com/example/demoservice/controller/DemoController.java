package com.example.demoservice.controller;

import com.example.demoapi.facade.DemoFacade;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements DemoFacade {

    @Value("${server.port}")
    private Integer port;

    @Override
    public String test() {
        return port + "";
    }
}
