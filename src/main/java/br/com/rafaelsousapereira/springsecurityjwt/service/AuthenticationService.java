package br.com.rafaelsousapereira.springsecurityjwt.service;

import org.springframework.security.core.Authentication;

public interface AuthenticationService {

    String authenticate(Authentication authentication);
}
