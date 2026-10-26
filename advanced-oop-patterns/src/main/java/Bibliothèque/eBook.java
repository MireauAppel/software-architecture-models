package Bibliothèque;

public record eBook(String title, Author author, double fileSize) implements DigitalMedia{
    public String getDescription(){
        return "eBook : " + title + " , " + author.getDescription() + " , " + fileSize;
    }
    public String getType(){
        return "eBook";
    }
}
