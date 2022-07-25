package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.domain.Driver;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.domain.TruckDriver;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberExeption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    Map<String, Person> persons = new HashMap<>(Map.of(
            "12345",
            new Person("Жан",
                    "Рено",
                    "12345",
                    2),
            "54321",
            new Person("Люк",
                    "Бессон",
                    "54321",
                    3),
            "41232",
            new Person("Жерар",
                    "Депардье",
                    "41232",
                    0),
            "928374",
            new Driver("Джейсон",
                    "Стетхем",
                    "928374",
                    2,
                    "3491"),
            "1000",
            new TruckDriver("Роберт",
                    "Патрик",
                    "1000",
                    4,
                    "2345")
    ));
    String[] proffessions = {
            "безработный",
            "водитель",
            "плотник",
            "столяр"
    };

    //    @Override
//    public String getPerson(Integer number) throws BadPersonNumberExeption {
//        final Person person;
//        if (number >= persons.size()) {
//
////                        return null;
//
//            throw new BadPersonNumberExeption("ошибка в том что номер человека заведомо больше размера массива");
//
////        try {
//
//        }
//        person = persons.get(number);
//
////        } catch (ArrayIndexOutOfBoundsException e) {
////            return "Попробуйте другой номер";
////        }
//        final String personDescription = ""
//                + person.getName() + " "
//                + person.getSurname() + " "
//                + person.getPassport() + " "
//                + proffessions[person.getProfessionNumber()];
//        return personDescription;
//    }
    @Override
    public void addPerson(Person person) {
        persons.put(person.getPassport(), person);
    }

    @Override
    public String getPersonByPassport(String passport) {
//        for (Person person : persons.values()) {
        final Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден");
        }
//    if (person.getPassport().equals(passport)) {
        final String personDescription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + proffessions[person.getProfessionNumber()];
        return personDescription;
//            }
//        }
    }
}
