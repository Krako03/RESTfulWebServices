package com.griddynamics.restfulwebservices.jpa;

import com.griddynamics.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
