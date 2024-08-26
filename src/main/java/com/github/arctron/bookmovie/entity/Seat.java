package com.github.arctron.bookmovie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Seat {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Hall hall;

    public Seat() {
    }

    public Seat(String name, Hall hall) {
        this(null, name, hall);
    }

    public Seat(Long id, String name, Hall hall) {
        this.id = id;
        this.name = name;
        this.hall = hall;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}
