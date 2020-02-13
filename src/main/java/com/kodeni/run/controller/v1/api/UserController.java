package com.kodeni.run.controller.v1.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping("/signin")
    public ResponseEntity<String> SignIn(String username)
    {
        return new ResponseEntity<String>("Hi " + username, HttpStatus.OK);
    }
}
