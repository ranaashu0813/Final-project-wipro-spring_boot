package com.mh.service;

import com.mh.entity.Hall;
import com.mh.repository.HallRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HallService {
    private final HallRepository repo;
    public HallService(HallRepository repo) { this.repo = repo; }

    public Hall save(Hall hall) { return repo.save(hall); }
    public List<Hall> getAll() { return repo.findAll(); }
    public void delete(Long id) { repo.deleteById(id); }
}
