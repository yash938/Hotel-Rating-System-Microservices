package com.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int hotelId;
    private String name;
    private String location;
    private String about;
}
