public record User(String identifiant, String lastName, String firstName, String mail) {
    String getDescription(){
        return firstName + " " + lastName;
    }
}
