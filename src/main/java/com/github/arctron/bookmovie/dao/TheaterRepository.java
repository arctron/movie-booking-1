package com.github.arctron.bookmovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.arctron.bookmovie.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

}
