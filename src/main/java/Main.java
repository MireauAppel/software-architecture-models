import Bibliothèque.*;

public class Main {
    public static void main(String[] args) {
        Author leroi = new Author("LeRoi", "belgian");
        DigitalMedia audioBookTest = new AudioBook("Audiooooo", new Author("LeRoi", "belgian"), 2.5);
        DigitalMedia eBookTest = new eBook("hello", leroi, 50);
        DigitalMedia DigitalMagazineTest = new DigitalMagazine("womens weekly", 669, "19/12/1995");
        User me = new User("a24007103", "APPEL", "Mireau", "me@gmail.com");

//        System.out.println(audioBookTest.getDescription());
//        System.out.println(DigitalMagazineTest.getDescription());
//        System.out.println(eBookTest.getDescription());
        System.out.println(new Loan(me, DigitalMagazineTest, "today", "tomorrow").toString());


    }
}
