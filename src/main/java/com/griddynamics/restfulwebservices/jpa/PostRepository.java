package com.griddynamics.restfulwebservices.jpa;

import com.griddynamics.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
