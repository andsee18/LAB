import java.util.LinkedList;
import java.util.HashMap;

class HashTable<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public HashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

class Book {
    private String title;
    private String author;
    private int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopies() {
        return copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", copies=" + copies +
                '}';
    }
}

class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String isbn, Book book) {
        books.put(isbn, book);
    }

    public Book findBook(String isbn) {
        return books.get(isbn);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public void printAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Демонстрация работы HashTable
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        System.out.println("Value for key 'one': " + hashTable.get("one"));
        hashTable.remove("one");
        System.out.println("Is hash table empty? " + hashTable.isEmpty());

        // Демонстрация работы Library
        Library library = new Library();
        library.addBook("978-3-16-148410-0", new Book("Book1", "Author1", 5));
        library.addBook("978-3-16-148410-1", new Book("Book2", "Author2", 3));
        System.out.println("Found book: " + library.findBook("978-3-16-148410-0"));
        library.removeBook("978-3-16-148410-1");
        library.printAllBooks();
    }
}