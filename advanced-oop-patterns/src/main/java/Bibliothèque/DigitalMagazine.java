package Bibliothèque;

public record DigitalMagazine(String title, int edition, String releaseDate) implements DigitalMedia {
    public String getDescription(){
        return "DigitalMagazine : " + title + " , " + edition + " , " + releaseDate;
    }
    public String getType() {
        return "DigitalMagazine";
    }
}
