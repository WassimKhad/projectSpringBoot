package com.example.Initialized;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        // Pour l'exemple, nous retournons une liste statique d'utilisateurs
        return Arrays.asList(
                new User(1L, "wassim", "wassim@example.com"),
                new User(2L, "john", "john@example.com"),
                new User(3L, "alice", "alice@example.com"));
    }
}