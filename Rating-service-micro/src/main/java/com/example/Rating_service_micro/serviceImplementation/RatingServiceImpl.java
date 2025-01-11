package com.example.Rating_service_micro.serviceImplementation;

import com.example.Rating_service_micro.entity.Rating;
import com.example.Rating_service_micro.repository.RatingRepo;
import com.example.Rating_service_micro.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepo repo;


    @Override
    public Rating createRating(Rating rating) {
        return repo.save(rating);
    }

    @Override
    public Rating singleRating(int ratingId) {
        return repo.findById(ratingId).orElseThrow(()->new RuntimeException("rating id is not found"));
    }

    @Override
    public List<Rating> getRatingByUser(int userId) {
        return repo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(int hotelId) {
        return repo.findByHotelId(hotelId);
    }
}
