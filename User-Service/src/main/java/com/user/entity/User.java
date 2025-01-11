package com.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    @Column(length = 20)
    private String name;

    @Column(length = 20,nullable = false,unique = true)
    private String email;
    @Column(length = 2)
    private int age;
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
