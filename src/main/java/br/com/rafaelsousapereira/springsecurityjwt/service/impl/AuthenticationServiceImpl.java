package br.com.rafaelsousapereira.springsecurityjwt.service.impl;

import br.com.rafaelsousapereira.springsecurityjwt.authentication.service.JwtServiceImpl;
import br.com.rafaelsousapereira.springsecurityjwt.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final JwtServiceImpl jwtService;

    @Autowired
    public AuthenticationServiceImpl(JwtServiceImpl jwtService) {
        this.jwtService = jwtService;
    }

    @Override
    public String authenticate(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }
}
