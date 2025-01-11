package com.example.Rating_service_micro.controller;

import com.example.Rating_service_micro.entity.Rating;
import com.example.Rating_service_micro.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRatings(@RequestBody Rating rating){
        Rating rating1 = ratingService.createRating(rating);
        return new ResponseEntity<>(rating1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> singleRating(@PathVariable int id){
        Rating rating = ratingService.singleRating(id);
        return new ResponseEntity<>(rating,HttpStatus.OK);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getUserFromRating(@PathVariable int userId){
        List<Rating> ratingByUser = ratingService.getRatingByUser(userId);
        return new ResponseEntity<>(ratingByUser,HttpStatus.OK);
    }

    @GetMapping("/rating/{ratingId}")
    public ResponseEntity<List<Rating>> getHotelFromRating(@PathVariable int ratingId){
        List<Rating> ratingByHotelId = ratingService.getRatingByHotelId(ratingId);
        return new ResponseEntity<>(ratingByHotelId,HttpStatus.OK);
    }
}
