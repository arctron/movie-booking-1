package com.github.arctron.bookmovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.arctron.bookmovie.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

}
