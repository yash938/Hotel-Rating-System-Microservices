package com.hotel.controller;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotels (@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.createHotel(hotel);
        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getHotelById(){
        List<Hotel> allHotels = hotelService.getAllHotels();
        return new ResponseEntity<>(allHotels,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingleHotels(@PathVariable int id){
        Hotel hotel = hotelService.singleHotel(id);
        return new ResponseEntity<>(hotel,HttpStatus.OK);
    }
}
