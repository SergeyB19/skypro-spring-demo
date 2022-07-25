package pro.sky.skyprospringdemo.example;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3};
        List<Integer> numbersList = new ArrayList<>(List.of(9, 2, 3, 5));
        Map<String, Integer> numbersMap = new HashMap<>();
        Map<String, Integer> numbersMap1 = new HashMap<>( Map.of("four",4, "five",5));
        numbersMap.put("two", 2);

        System.out.println(numbersArray[0]);
        System.out.println(numbersList.get(0));
        /* получение значения элемента*/
        final Integer num = numbersArray[0];
        numbersList.get(0);
        numbersMap.get("two");

        /* запись значения в элемент*/
        numbersArray[1] = 10;
        numbersList.set(1, 10);
        numbersMap.put("one", 1);
        /* получение размера*/
        final int lenght = numbersArray.length;
        numbersList.size();
        numbersMap.size();
        /* получение строки с содержимым коллекции*/
        Arrays.toString(numbersArray);
        numbersList.toString();
        numbersMap.toString();
        /* добавление элемента в конец коллекции*/
        numbersList.add(56);
        numbersMap.put("three",3);



        System.out.println(numbersArray.length);
        System.out.println(numbersList.size());


        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersList);

        numbersList.add(56);
        System.out.println(numbersList);
        System.out.println(numbersMap);
        System.out.println(numbersMap1);
    }
}
