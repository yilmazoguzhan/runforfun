package com.kodeni.run.controller.v1.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<String> SignIn()
    {
        return new ResponseEntity<String>("Hi " + " sadf", HttpStatus.OK);
    }
}
