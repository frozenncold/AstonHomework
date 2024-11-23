package Lesson_13.Task2;

public class Main {
    public static void main(String[] args) {
        TelephoneBook phonebook = new TelephoneBook();

        phonebook.add("Иванов", "22546465");
        phonebook.add("Иванов", "2233547657");
        phonebook.add("Петров", "2233756756");
        phonebook.add("Сидоров", "2235676588");
        phonebook.add("Иванов", "22675682");
        System.out.println();

        System.out.println("Получаем номера: \n ");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println();
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println();
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println();

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println();

        System.out.println("Существующий номер");
        phonebook.add("Иванов", "143244356");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}
