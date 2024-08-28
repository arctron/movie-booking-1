package com.github.arctron.bookmovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.arctron.bookmovie.entity.Booking;
import com.github.arctron.bookmovie.entity.BookingId;

public interface BookingRepository extends JpaRepository<Booking, BookingId> {

}
