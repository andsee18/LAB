import java.util.regex.*;
public class IPAddressValidator {
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1";
        if (isValidIPAddress(ipAddress)) {
            System.out.println("IP-адрес корректный.");
        } else {
            System.out.println("IP-адрес не соответствует требованиям.");
        }
    }

    public static boolean isValidIPAddress(String ipAddress) {
        if (ipAddress == null || ipAddress.isEmpty()) {
            System.out.println("IP-адрес пустой или равен null.");
            return false;
        }

        // Регулярное выражение для проверки IP-адреса
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }
}