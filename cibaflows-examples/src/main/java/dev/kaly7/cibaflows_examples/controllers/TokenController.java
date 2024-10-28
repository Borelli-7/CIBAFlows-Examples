package dev.kaly7.cibaflows_examples.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TokenController {

    @GetMapping("/secure")
    public ResponseEntity<String> secureEndpoint() {
        return ResponseEntity.ok("You have accessed a secure resource!");
    }
}
