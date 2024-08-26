package com.github.arctron.bookmovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.arctron.bookmovie.entity.Hall;

public interface HallRepository extends JpaRepository<Hall, Long> {

}
