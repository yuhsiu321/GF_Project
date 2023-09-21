package at.fhtw.swen3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ComponentBImpl implements ComponentB{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void sayHello() {
        log.info("Hello");
    }

    @Override
    public void saveOnePerson() {
        PersonEntity person = PersonEntity.builder()
                .name("Kua")
                .build();
        personRepository.save(person);
    }

    @Override
    public void printAllPerson() {
        personRepository.findAll().forEach(
                personEntity -> log.info(personEntity.toString())
        );
    }
}
