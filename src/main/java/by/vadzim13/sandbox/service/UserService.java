package by.vadzim13.sandbox.service;

import by.vadzim13.sandbox.data.UserRepository;
import by.vadzim13.sandbox.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public User findUser(UUID id) {
        return userRepository.findUser(id);
    }


    public boolean deleteUser(UUID id) {
        return userRepository.deleteUser(id);
    }
}

