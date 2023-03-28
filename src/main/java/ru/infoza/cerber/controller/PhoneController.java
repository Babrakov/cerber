package ru.infoza.cerber.controller;

import org.springframework.web.bind.annotation.*;
import ru.infoza.cerber.entity.Phone;
import ru.infoza.cerber.repository.PhoneRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PhoneController {

    private final PhoneRepository phoneRepository;

    public PhoneController(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @GetMapping("/phones")
    public List<Phone> getPhones() {
        return (List<Phone>) phoneRepository.findAll();
    }

    @PostMapping("/users")
    void addPhone(@RequestBody Phone phone) {
        phoneRepository.save(phone);
    }
}
