package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/app")
public class AppControlller {

    @GetMapping
    public ResponseEntity getApp() {
        return ResponseEntity.ok().build();
    }
}
