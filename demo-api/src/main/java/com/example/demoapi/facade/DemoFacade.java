package com.example.demoapi.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("demo2")
public interface DemoFacade {

    @GetMapping("/")
    String test();
}
