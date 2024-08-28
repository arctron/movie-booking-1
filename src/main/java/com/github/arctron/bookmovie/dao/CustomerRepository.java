package com.github.arctron.bookmovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.arctron.bookmovie.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
