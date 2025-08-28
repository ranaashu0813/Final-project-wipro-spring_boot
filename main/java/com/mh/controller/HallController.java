package com.mh.controller;

import com.mh.dto.HallDTO;
import com.mh.entity.Hall;
import com.mh.service.HallService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/halls")
public class HallController {
    private final HallService service;
    public HallController(HallService service) { this.service = service; }

    @GetMapping
    public List<Hall> getAll() { return service.getAll(); }

    @PostMapping
    public Hall add(@RequestBody HallDTO dto) {
        return service.save(new Hall(null, dto.getName(), dto.getLocation()));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Hall deleted";
    }
}
