package com.griddynamics.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAOService {
    private static List<User> users = new ArrayList<User>();

    private static int userCounter = 0;

    static {
        users.add(new User(++userCounter, "Adam", LocalDateTime.now().minusYears(30)));
        users.add(new User(++userCounter, "Eve", LocalDateTime.now().minusYears(25)));
        users.add(new User(++userCounter, "Jim", LocalDateTime.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++userCounter);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
