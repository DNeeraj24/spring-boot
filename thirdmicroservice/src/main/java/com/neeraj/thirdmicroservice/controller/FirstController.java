package com.neeraj.thirdmicroservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/service3")
@RestController
public class FirstController {

    @PostMapping("/print")
    public ResponseEntity<String> print() {
        return ResponseEntity.ok("Hello from Service 3");
    }
}
