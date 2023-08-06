package com.example.threadpool;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/healthcheck")
@RequiredArgsConstructor
@RestController
public class HealthCheck {

    @GetMapping()
    public String healthCheck() {
        return "I'm healthy";
    }
}
