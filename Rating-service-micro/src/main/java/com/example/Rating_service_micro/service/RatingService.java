package com.example.Rating_service_micro.service;

import com.example.Rating_service_micro.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    Rating singleRating(int ratingId);
    List<Rating> getRatingByUser(int userId);
    List<Rating> getRatingByHotelId(int hotelId);
}
