package com.github.arctron.bookmovie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Theater {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Theater() {
    }

    public Theater(String name) {
        this(null, name);
    }

    public Theater(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
