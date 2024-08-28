package com.github.arctron.bookmovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.arctron.bookmovie.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long> {

}
