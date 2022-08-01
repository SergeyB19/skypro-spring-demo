package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberExeption;

import java.util.List;

public interface PersonService {
//    public String getPerson(Integer number) throws BadPersonNumberExeption;

    List<Person> getPersonsByProfession(Integer professionNumber);

    List<Person> getPersonsByProfessions(List<Integer> professionNumbers);

    void addPerson(Person person);

    void addProfession(String passport, Integer profession);

    String getPersonByPassport(String passport);
}
