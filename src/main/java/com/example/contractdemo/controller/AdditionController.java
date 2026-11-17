package com.example.contractdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping(value = "/ms1/add", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> add(
            @RequestParam("a") int a,
            @RequestParam("b") int b) {

        int result = a + b;
        String response = "MS 1.1 - Addition = " + result;

        return ResponseEntity.ok()
                .contentType(new MediaType("text", "plain", java.nio.charset.StandardCharsets.UTF_8))
                .body(response);
    }
}
