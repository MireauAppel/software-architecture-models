package Bibliothèque;

public record User(String identifiant, String lastName, String firstName, String mail) {
    public String getDescription(){
        return firstName + " " + lastName;
    }
}
