package com.dsi33nechi.BookEvent.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi33nechi.BookEvent.entites.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>  {

}
