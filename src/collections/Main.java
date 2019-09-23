package collections;

import collections.password.PasswordValidator;
import collections.phonebook.Phonebook;
import collections.uniqwords.UniqWords;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "+79990000000");
        phonebook.add("Петров", "+79991111111");
        phonebook.add("Сидоров", "+79992222222");
        phonebook.add("Кузнецов", "+79993333333");
        phonebook.add("Медведев", "+79994444444");
        phonebook.add("Иванов", "+79995555555");
        phonebook.add("Дятлов", "+79996666666");
        phonebook.add("Петров", "+79997777777");
        phonebook.add("Иванов", "+79998888888");

        phonebook.get("ИвАнОв");

        System.out.println();

        System.out.println(PasswordValidator.isValid("qwerty"));
        System.out.println(PasswordValidator.isValid("qwerty123"));
        System.out.println(PasswordValidator.isValid("qw12NM"));
        System.out.println(PasswordValidator.isValid("qwe123RTY"));
        System.out.println(PasswordValidator.isValid("123"));
        System.out.println(PasswordValidator.isValid("123dfgfff#$%f"));
        System.out.println(PasswordValidator.isValid("123dfgffSDFf#$%$#%fF333FG"));
        System.out.println(PasswordValidator.isValid("ываЫВА5ыПЫк333"));

        System.out.println();
        String[] testStringArray = {
                "Яблоко", "Груша", "Апельсин", "Груша", "Слива",
                "Арбуз", "Яблоко", "Дыня", "Вишня", "Слива",
                "Груша", "Клубника", "Яблоко", "Смородина", "Груша",
                "Груша", "Апельсин", "Груша", "Вишня", "Слива"
        };

        UniqWords.analizeArray(testStringArray);
    }
}