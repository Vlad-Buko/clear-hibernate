package services;

import models.Motorcycles;
import models.Person;
import repository.PersonRepository;

import java.util.List;

public class PersonServices {
    private PersonRepository personRepository = new PersonRepository();

    public PersonServices() {
    }

    public Person findPerson(int id) {
        return personRepository.findById(id);
    }
    public void savePerson(Person person) {
        personRepository.save(person);
    }
    public void deletePerson(Person person) {
        personRepository.delete(person);
    }
    public void updatePerson(Person person) {
        personRepository.update(person);
    }

    public List<Person> findAllPeople () {
        return personRepository.findAll();
    }
    public Motorcycles findMotoById (int id) {
        return personRepository.findMotoById(id);
    }

}
