package com.viniciusfernandes.spring_security_jwt.Web;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusfernandes.spring_security_jwt.Security.AuthenticationService;

@RestController
public class AuthenticationController {

  private final AuthenticationService authenticationService;

  private AuthenticationController(AuthenticationService authenticationService) {
    this.authenticationService = authenticationService;
  }

  @PostMapping("authenticate")
  public String authenticate(Authentication authentication) {
    return authenticationService.authenticate(authentication);
  }

  
}
