package com.mh.dto;

public class BookingDTO {
    private String username;
    private String hallName;

    public BookingDTO() {}
    public BookingDTO(String username, String hallName) {
        this.username = username;
        this.hallName = hallName;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getHallName() { return hallName; }
    public void setHallName(String hallName) { this.hallName = hallName; }
}
