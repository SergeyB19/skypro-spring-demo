package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberExeption;

public interface PersonService {
//    public String getPerson(Integer number) throws BadPersonNumberExeption;

    void addPerson(Person person);

    String getPersonByPassport(String passport);
}
