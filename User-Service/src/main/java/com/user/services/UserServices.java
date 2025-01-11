package com.user.services;

import com.user.entity.User;

import java.util.List;

public interface UserServices {
    User createUser(User user);
    User updateUser(int userId,User user);
    List<User> getAllUser();
    User getSingleUser(int userId);
}
