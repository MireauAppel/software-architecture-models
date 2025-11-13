package agency;

import java.util.Objects;

public class Client {
    private final int yearOfBirth;
    private final String lastName;
    private final String firstName;

    public Client(int yearOfBirth, String lastName, String firstName) {
        this.yearOfBirth = yearOfBirth;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return yearOfBirth == client.yearOfBirth && Objects.equals(lastName, client.lastName) && Objects.equals(firstName, client.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, lastName, firstName);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
