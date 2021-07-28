package HomeWork3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
/*
  1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
  Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
  Посчитать сколько раз встречается каждое слово.
 */
        List<String> words = Arrays.asList(
                "Black", "Green", "Yellow", "White", "Black", "Blue", "Red", "White",
                "Blue", "Blue", "Black", "Green", "Blue", "Red", "Yellow", "Green", "Cyan"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный массив:");
        System.out.println(words);
        System.out.println("Уникальные слова:");
        System.out.println(unique);
        System.out.println("Частота встречаемости слов:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

/*2.Написать простой класс ТелефонныйСправочник,который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add()можно добавлять записи.
 С помощью метода get()искать номер телефона по фамилии.Следует учесть,что под одной фамилией может быть
 несколько телефонов,тогда при запросе такой фамилии должны выводиться все телефоны.
 */
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Иванов", "987321");
        phonebook.add("Кузнецов", "21321687");
        phonebook.add("Петров", "65465");
        phonebook.add("Сидоров", "9879");
        phonebook.add("Петров", "65465");
        phonebook.add("Сидоров", "798456123");
        System.out.println("Иванов" + phonebook.get("Иванов"));
        System.out.println("Петров" + phonebook.get("Петров"));
        System.out.println("Сидоров" + phonebook.get("Сидоров"));
        System.out.println("Кузнецов" + phonebook.get("Кузнецов"));

    }
}