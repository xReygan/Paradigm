//Декларативное программирование:
//Задача 4: Поиск уникальных элементов в списке.
//Напишите программу, которая создает новый список, содержащий
//только уникальные элементы из исходного списка.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Deckl_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("9");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("1");
        list.add("7");
        list.add("9");
        System.out.println("Начальный список: " + list);
        
        HashSet<String> uniqueElements = new HashSet<String>(list);
        System.out.println("Полученный список: " + uniqueElements);
    }
}
