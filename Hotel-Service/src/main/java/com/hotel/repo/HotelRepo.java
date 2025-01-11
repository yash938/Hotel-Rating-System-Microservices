package com.hotel.repo;

import com.hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer> {
}
