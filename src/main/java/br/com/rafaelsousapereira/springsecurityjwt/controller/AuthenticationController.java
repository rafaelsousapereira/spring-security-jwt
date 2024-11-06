package br.com.rafaelsousapereira.springsecurityjwt.controller;

import br.com.rafaelsousapereira.springsecurityjwt.service.impl.AuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

    private final AuthenticationServiceImpl service;

    @Autowired
    public AuthenticationController(AuthenticationServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/authenticate")
    public String authenticate(Authentication authentication) {
        return this.service.authenticate(authentication);
    }

}
