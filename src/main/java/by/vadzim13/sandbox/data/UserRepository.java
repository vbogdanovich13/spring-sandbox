package by.vadzim13.sandbox.data;

import by.vadzim13.sandbox.service.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public User createUser(User user) {
        UUID id = UUID.randomUUID();
        user.setId(id);
        users.add(user);
        return user;
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + " " + user.getId());
        }
    }


    public User findUser(UUID id) {
        User foundUser = null;
        for (User user : users) {
            if (id.equals(user.getId())) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    public List<User> findUsers(List<UUID> ids) {
        List<User> foundUsers = new ArrayList<>();
        for (User user : users) {
            if (ids.contains(user.getId())) {
                foundUsers.add(user);
            }
        }
        return foundUsers;
    }

    public boolean deleteUser(UUID id) {
        return users.removeIf(user -> id.equals(user.getId()));
    }

}

