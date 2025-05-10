package com.griddynamics.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private UserDAOService userDAOService;

    public UserResource(UserDAOService userDAOService) {
        this.userDAOService = userDAOService;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAll() {
        return userDAOService.findAll();
    }

    @GetMapping(path = "/users/{userId}")
    public User retrieveOne(@PathVariable int userId) {
        User user = userDAOService.findOne(userId);
        if (user == null) {
            throw new UserNotFoundException("id: " + userId);
        }
        return user;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User saved = userDAOService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(saved.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userDAOService.deleteById(userId);
    }
}
