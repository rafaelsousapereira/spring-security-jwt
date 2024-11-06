package br.com.rafaelsousapereira.springsecurityjwt.authentication.service;

import org.springframework.security.core.Authentication;

public interface JwtService {

    String generateToken(Authentication authentication);
}
