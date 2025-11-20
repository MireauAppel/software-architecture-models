package Bibliothèque;

public record AudioBook(String title, Author author, double readingTime) implements DigitalMedia {
    public String getDescription(){
        return "AudioBook : " + title + " , " + author.getDescription() + " , " + readingTime;
    }
}
