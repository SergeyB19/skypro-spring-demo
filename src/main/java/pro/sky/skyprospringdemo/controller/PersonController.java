package pro.sky.skyprospringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberExeption;
import pro.sky.skyprospringdemo.service.PersonService;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/person")
    public String getPersonInfo(@RequestParam("number") Integer number)  {
//        try {
//            return personService.getPerson(number); 
        final String person;
        try {
            person = personService.getPerson(number);
        } catch (BadPersonNumberExeption e) {
            throw new RuntimeException(e);
        }
//            System.out.println("Работа метода getPersonInfo закончена");
            return person;
//            if (person == null) {
//                return "Попробуйте другой номер";
//            }
//            return person;

//        } catch (BadPersonNumberExeption e) {
//            System.out.println("Работа метода getPersonInfo закончена");
//            return "Попробуйте другой номер";
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Работа метода getPersonInfo закончена");
//            return "Попробуйте в другой раз";
//        } finally {
//            System.out.println("Работа метода getPersonInfo закончена");
//        }
    }
}
