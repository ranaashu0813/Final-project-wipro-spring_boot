package com.mh.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String hallName;

    public Booking() {}

    public Booking(Long id, String username, String hallName) {
        this.id = id;
        this.username = username;
        this.hallName = hallName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getHallName() { return hallName; }
    public void setHallName(String hallName) { this.hallName = hallName; }
}
