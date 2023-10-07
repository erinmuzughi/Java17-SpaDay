package org.launchcode.spaday.data;

import org.launchcode.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    //list of users:
    private static Map<Integer, User> users = new HashMap<>(); //need a place to keep our events; will store integer user pairs, integers will be the IDs;
    // via add
    public static void add(User user) {
        users.put(user.getId(), user);
    }
    // via get all users
    public static Collection<User> getAll() { //Collection is an interface, which extends iterable interface, which allows iteration -- easily loop over it.
        return users.values();
    }
    //and via getById
    public static User getById(Integer id) {
        return users.get(id);
    }
}
