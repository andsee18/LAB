import java.util.regex.*;
public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price of the product is $19.99 and there are 10 items in stock.";
        findNumbers(text);
    }

    public static void findNumbers(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("Текст пустой или равен null.");
            return;
        }

        // Регулярное выражение для поиска целых чисел и чисел с плавающей точкой
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}