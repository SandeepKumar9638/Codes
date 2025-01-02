package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

	

	Hotel findByprice(double price);

	Hotel findBybookingid(long bookingid);

    
}
