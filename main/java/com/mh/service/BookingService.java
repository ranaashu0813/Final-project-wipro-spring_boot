package com.mh.service;

import com.mh.entity.Booking;
import com.mh.repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository repo;
    public BookingService(BookingRepository repo) { this.repo = repo; }

    public Booking save(Booking booking) { return repo.save(booking); }
    public List<Booking> getAll() { return repo.findAll(); }
    public void delete(Long id) { repo.deleteById(id); }
}
