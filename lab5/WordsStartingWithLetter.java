import java.util.regex.*;
public class WordsStartingWithLetter {
    public static void main(String[] args) {
        String text = "Apple is a fruit. Apricot is also a fruit. Banana is a fruit too.";
        char letter = 'A';
        findWordsStartingWith(text, letter);
    }

    public static void findWordsStartingWith(String text, char letter) {
        if (text == null || text.isEmpty()) {
            System.out.println("Текст пустой или равен null.");
            return;
        }

        // Регулярное выражение для поиска слов, начинающихся с заданной буквы
        String regex = "\\b" + letter + "[a-zA-Z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}