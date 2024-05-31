package io.songpon.nameservice.repository;

import io.songpon.nameservice.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
