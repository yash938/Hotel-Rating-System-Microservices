package com.example.Rating_service_micro.repository;

import com.example.Rating_service_micro.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Integer> {
    List<Rating> findByUserId(int userId);
    List<Rating> findByHotelId(int hotelId);
}
