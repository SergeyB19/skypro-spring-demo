package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.domain.Driver;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.domain.TruckDriver;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberExeption;

@Service
public class PersonServiceImpl implements PersonService {
    Person[] persons = {
            new Person("Жан", "Рено", "12345", 2),
            new Person("Люк", "Бессон", "54321", 3),
            new Person("Жерар", "Депардье", "41232", 0),
            new Driver("Джейсон", "Стетхем", "928374", 2, "3491"),
            new TruckDriver("Роберт", "Патрик", "1000", 4, "2345")
    };
    String[] proffessions = {
            "безработный",
            "водитель",
            "плотник",
            "столяр"
    };

    @Override
    public String getPerson(Integer number) throws BadPersonNumberExeption {
        final Person person;
        if (number >= persons.length) {
//                        return null;
            throw new BadPersonNumberExeption("ошибка в том что номер человека заведомо больше размера массива");
//        try {
        }
        person = persons[number];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            return "Попробуйте другой номер";
//        }
        final String personDescription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + proffessions[person.getProfessionNumber()];
        return personDescription;
    }
}
