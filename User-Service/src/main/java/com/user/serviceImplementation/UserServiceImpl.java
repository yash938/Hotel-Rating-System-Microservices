package com.user.serviceImplementation;

import com.user.exception.ResourceNotFoundException;
import com.user.repository.UserRepo;
import com.user.services.UserServices;
import com.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepo userRepo;
    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(int userId, User user) {
        User users = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User is not found"));
        users.setAbout(user.getAbout());
        users.setName(user.getName());
        users.setEmail(user.getEmail());
        users.setAge(user.getAge());
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getSingleUser(int userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User is not found"));
        return user;
    }
}
