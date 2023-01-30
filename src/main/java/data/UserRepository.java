package data;

import org.springframework.stereotype.Service;
import service.model.User;

import java.util.*;
@Service


public class UserRepository {

    ArrayList<User> users = new ArrayList<User>();

    public User createUser(User user) {
       // UUID id = UUID.randomUUID();

        users.add(new User());
        return User;
    }

    public User findUser(String id) {
        String id = "";
        for (String id : users) {
            id = id + users +"";
        }


    }
    public User deleteUser(UUID id) {
        users.removeIf(User -> )
    }

}

