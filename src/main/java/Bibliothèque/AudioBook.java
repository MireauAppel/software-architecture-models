package Bibliothèque;

public record AudioBook(String title, Author author, double readingTime) {
    public String getDescription(){
        return "AudioBook : " + title + " , " + author + " , " + readingTime;
    }
}
