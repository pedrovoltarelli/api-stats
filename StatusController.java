package com.example.api_stats.controller;

import com.example.api_stats.endpoint.StatsEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class StatusController {

    @GetMapping("/status")
    public StatsEndpoint statusApi(){
        return new StatsEndpoint("Ok", "1.0.0", LocalDateTime.now());
    }
}
