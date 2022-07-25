package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberExeption;

public interface PersonService {
//    public String getPerson(Integer number) throws BadPersonNumberExeption;

    void addPerson(Person person);

    void addProfession(String passport, Integer profession);

    String getPersonByPassport(String passport);
}
