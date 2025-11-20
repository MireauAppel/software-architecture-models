package Bibliothèque;

public record DigitalMagazine(String title, int edition, String releaseDate) {
    public String getDescription(){
        return "DigitalMagazine : " + title + " , " + edition + " , " + releaseDate;
    }
}
