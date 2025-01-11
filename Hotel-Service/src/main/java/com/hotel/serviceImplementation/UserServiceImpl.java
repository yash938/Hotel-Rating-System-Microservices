package com.hotel.serviceImplementation;

import com.hotel.entity.Hotel;
import com.hotel.exception.ResourceNotFoundException;
import com.hotel.repo.HotelRepo;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements HotelService {
    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel singleHotel(int id) {
        return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel is not found "));
    }
}
