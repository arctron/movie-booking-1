package com.github.arctron.bookmovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.arctron.bookmovie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
