package com.user.controller;

import com.user.services.UserServices;
import com.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping
    public ResponseEntity<User> createUsers(@RequestBody User user){
        User user1 = userServices.createUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUsers(@PathVariable int id,@RequestBody User user){
        User user1 = userServices.updateUser(id, user);
        return new ResponseEntity<>(user1,HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> singleUser(@PathVariable int userId){
        User singleUser = userServices.getSingleUser(userId);
        return new ResponseEntity<>(singleUser,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> allUsers(){
        List<User> allUser = userServices.getAllUser();
        return new ResponseEntity<>(allUser,HttpStatus.OK);
    }
}
