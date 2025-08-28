package com.mh.controller;

import com.mh.dto.BookingDTO;
import com.mh.entity.Booking;
import com.mh.service.BookingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService service;
    public BookingController(BookingService service) { this.service = service; }

    @GetMapping
    public List<Booking> getAll() { return service.getAll(); }

    @PostMapping
    public Booking add(@RequestBody BookingDTO dto) {
        return service.save(new Booking(null, dto.getUsername(), dto.getHallName()));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Booking deleted";
    }
}
