package com.github.arctron.bookmovie.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BookingId {
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Show show;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Seat seat;

    public BookingId() {
    }

    public BookingId(Show show, Seat seat) {
        this.show = show;
        this.seat = seat;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
