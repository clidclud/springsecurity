package ru.gb.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springsecurity.model.Person;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByLogin(String login);
}
