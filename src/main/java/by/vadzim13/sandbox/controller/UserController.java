package by.vadzim13.sandbox.controller;

import by.vadzim13.sandbox.data.UserRepository;
import by.vadzim13.sandbox.service.UserService;
import by.vadzim13.sandbox.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable UUID id) {
        return userService.findUser(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable UUID id) {
        return userService.deleteUser(id);
    }
}
