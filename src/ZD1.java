import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов.

public class ZD1 {
    public static void main(String[] args) {

        Map<String, String> bookFone = new HashMap<>();
        bookFone.put("Иванов И.И ", " 25-85-45");
        bookFone.put("Петров А.А ", " 37-23-63");
        bookFone.put("Семёнов Е.Н ", " 32-76-53");
        bookFone.put("Смирнов К.А ", " 31-15-78");
        bookFone.put("Любимов С.С ", " 24-23-89, 28-43-53");
        bookFone.put("Петухов К.К ", " 29-15-13");
        bookFone.put("Смирнов Г.Г ", " 31-78-99, 24-29-00");
        System.out.println(bookFone.get("Иванов И.И."));
        System.out.println(bookFone.get("Лобанов Г.О."));

        addBookFone(bookFone, "Голиков Б.Б ", " 25-02-45");

        System.out.println(bookFone.get("Голиков Б.Б "));

        deleteBookFone(bookFone, "Иванов И.И ");

        System.out.println(bookFone);
    }

    // Добавить или изменить или изменить данные
    public static void addBookFone(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Удалить данные
    public static void deleteBookFone(Map<String, String> dict, String name){
        dict.remove(name);
    }
}
