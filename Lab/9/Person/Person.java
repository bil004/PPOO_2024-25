package Person;

public class Person {
    private String firstName; // nome
    private String lastName; // cognome

    // costruttore
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // metodi get
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return p.getFirstName().equals(this.getFirstName()) && p.getLastName().equals(this.getLastName());
        }
        
        return false;
    }

    public String toString() {
        return "<" + this.firstName + "," + this.lastName + ">";
    }
}
