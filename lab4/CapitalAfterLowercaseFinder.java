import java.util.regex.*;
public class CapitalAfterLowercaseFinder {
    public static void main(String[] args) {
        String text = "This is a Test String with Some Cases like aB and cD.";
        String result = highlightCapitalAfterLowercase(text);
        System.out.println(result);
    }

    public static String highlightCapitalAfterLowercase(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("Текст пустой или равен null.");
            return text;
        }

        // Регулярное выражение для поиска строчной буквы, за которой сразу идет заглавная
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        // Замена найденных совпадений на строку с выделением
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group(1) + "!" + matcher.group(2) + "!");
        }
        matcher.appendTail(result);

        return result.toString();
    }
}