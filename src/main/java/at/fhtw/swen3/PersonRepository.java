package at.fhtw.swen3;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
