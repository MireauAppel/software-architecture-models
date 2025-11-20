import Bibliothèque.AudioBook;
import Bibliothèque.Author;
import Bibliothèque.DigitalMedia;

public class Main {
    public static void main(String[] args) {
        DigitalMedia audioBookTest = new AudioBook("test", new Author("test2", "belgian"), 2.5);
        System.out.println(audioBookTest.getDescription());
    }
}
