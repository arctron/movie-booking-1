package com.github.arctron.bookmovie.entity;

import org.springframework.data.domain.Persistable;
import org.springframework.lang.Nullable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking implements Persistable<BookingId> {
    @EmbeddedId
    private BookingId bookingId;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;

    public Booking() {
    }

    public Booking(BookingId bookingId, Customer customer) {
        this.bookingId = bookingId;
        this.customer = customer;
    }

    public BookingId getBookingId() {
        return bookingId;
    }

    public void setBookingId(BookingId bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    @Nullable
    public BookingId getId() {
        return getBookingId();
    }

    @Override
    public boolean isNew() {
        return true;
    }
}
