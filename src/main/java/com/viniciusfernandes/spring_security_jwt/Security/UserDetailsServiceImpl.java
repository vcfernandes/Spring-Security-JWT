package com.viniciusfernandes.spring_security_jwt.Security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.viniciusfernandes.spring_security_jwt.Repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
  
   private final UserRepository userRepository;

  public UserDetailsServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return userRepository.findByUsername(username)
        .map(UserAuthenticated::new)
        .orElseThrow(
            () -> new UsernameNotFoundException("User Not Found with username" ));
  }

}