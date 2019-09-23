package collections;

import collections.password.PasswordValidator;
import collections.phonebook.Phonebook;
import collections.uniqwords.UniqWords;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        String[][] testPhoneArray = {
                {"Иванов", "+79990000000"}, {"Петров", "+79991111111"}, {"Сидоров", "+79992222222"},
                {"Кузнецов", "+79993333333"}, {"Медведев", "+79994444444"}, {"Иванов", "+79995555555"},
                {"Дятлов", "+79996666666"}, {"Петров", "+79997777777"}, {"Иванов", "+79998888888"}
        };
        for (String[] s : testPhoneArray)
            phonebook.add(s[0], s[1]);

        System.out.println("Иванов:");
        phonebook.get("ИвАнОв");

        System.out.println();
        String[] testPassArray = {
                "qwerty", "qwerty123", "qw12NM", "qwe123RTY", "123",
                "123dfgfff#$%f", "123dfgffSDFf#$%$#%fF333FG", "ываЫВА5ыПЫк333"};
        for (String s : testPassArray)
            System.out.println("Пароль " + s + " - " + PasswordValidator.isValid(s));

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