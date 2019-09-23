package collections.password;

public class PasswordValidator {
    public static boolean isValid(String pass) {
        String regStr="^(?=.*?[A-ZА-Я])(?=.*?[a-zа-я])(?=.*?\\d)\\S{8,}$";
        return pass.matches(regStr);
    }
}
