package br.com.erudio.repository;

import br.com.erudio.data.dto.PersonDTO;
import br.com.erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
