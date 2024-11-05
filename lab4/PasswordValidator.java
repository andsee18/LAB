import java.util.regex.*;
public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Passw0rd";
        if (isValidPassword(password)) {
            System.out.println("Пароль корректный.");
        } else {
            System.out.println("Пароль не соответствует требованиям.");
        }
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.isEmpty()) {
            System.out.println("Пароль пустой или равен null.");
            return false;
        }

        // Регулярное выражение для проверки пароля
        String regex = "^(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,16}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
