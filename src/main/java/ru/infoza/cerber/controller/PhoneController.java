package ru.infoza.cerber.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.infoza.cerber.entity.Phone;
import ru.infoza.cerber.repository.PhoneRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/test")
public class PhoneController {

    private final PhoneRepository phoneRepository;

    public PhoneController(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @GetMapping("/phones")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Phone> getPhones() {
        return (List<Phone>) phoneRepository.findAll();
    }

    @PostMapping("/phones")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    void addPhone(@RequestBody Phone phone) {
        phoneRepository.save(phone);
    }
}
