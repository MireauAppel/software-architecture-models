package Bibliothèque;

public record Author(String name, String nationality) {
    public String getDescription(){
        return name + " , " + nationality;
    }
}
