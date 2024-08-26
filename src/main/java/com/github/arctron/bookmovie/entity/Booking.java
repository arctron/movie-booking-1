package com.github.arctron.bookmovie.entity;

import com.github.arctron.bookmovie.constants.Day;
import com.github.arctron.bookmovie.constants.DaySlot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// @Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long id;
    private Movie movie;
    private Seat seat;
    private Hall hall;
    private Theater theater;
    private DaySlot daySlot;
    private Day day;

    public Booking() {
    }

    public Booking(Movie movie, Seat seat, Hall hall, Theater theater, DaySlot daySlot, Day day) {
        this(null, movie, seat, hall, theater, daySlot, day);
    }

    public Booking(Long id, Movie movie, Seat seat, Hall hall, Theater theater, DaySlot daySlot, Day day) {
        this.id = id;
        this.movie = movie;
        this.seat = seat;
        this.hall = hall;
        this.theater = theater;
        this.daySlot = daySlot;
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public DaySlot getDaySlot() {
        return daySlot;
    }

    public void setDaySlot(DaySlot daySlot) {
        this.daySlot = daySlot;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
