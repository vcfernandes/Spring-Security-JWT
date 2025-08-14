package com.viniciusfernandes.spring_security_jwt.Repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.viniciusfernandes.spring_security_jwt.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
  
  Optional<User> findByUsername(String username);
  
}
