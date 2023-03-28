package ru.infoza.cerber.repository;

import org.springframework.data.repository.CrudRepository;
import ru.infoza.cerber.entity.Phone;

public interface PhoneRepository extends CrudRepository<Phone,Long> {
}
