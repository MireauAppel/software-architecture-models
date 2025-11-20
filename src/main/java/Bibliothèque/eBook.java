package Bibliothèque;

public record eBook(String title, Author author, int fileSize) {
    public String getDescription(){
        return "eBook : " + title + " , " + author + " , " + fileSize;
    }
}
