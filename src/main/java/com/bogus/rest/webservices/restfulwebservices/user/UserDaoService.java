package com.bogus.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(0, "Adam", new Date()));
        users.add(new User(1, "Eve", new Date()));
        users.add(new User(2, "Jack", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(users.size());
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user: users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User deleteById(int id){
        for(User user: users){
            if(user.getId() == id){
                users.remove(user);
                return user;
            }
        }
        return null;
    }

}
