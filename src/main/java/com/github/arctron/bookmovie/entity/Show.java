package com.github.arctron.bookmovie.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Show {
    @Id
    @GeneratedValue
    private Long id;
    private java.time.LocalDate date;
    private java.time.LocalTime startTime;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Hall hall;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Movie movie;

    public Show() {
    }

    public Show(LocalDate date, LocalTime startTime, Hall hall, Movie movie) {
        this(null, date, startTime, hall, movie);
    }

    public Show(Long id, LocalDate date, LocalTime startTime, Hall hall, Movie movie) {
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.hall = hall;
        this.movie = movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.time.LocalDate getDate() {
        return date;
    }

    public void setDate(java.time.LocalDate date) {
        this.date = date;
    }

    public java.time.LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(java.time.LocalTime startTime) {
        this.startTime = startTime;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
