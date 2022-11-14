package com.stankor.springboot.dao;



import com.stankor.springboot.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(long id, User updatedUser);

}
