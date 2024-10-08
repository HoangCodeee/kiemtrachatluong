import java.util.ArrayList;

public class QLNL {
    private ArrayList<Person> personnel;

    public QLNL() {
        personnel = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personnel.add(person);
    }

    public Person searchByName(String name) {
        for (Person person : personnel) {
            if (person.displayInfo().contains("Name: " + name)) {
                return person;
            }
        }
        return null;
    }

    public void displayAllPersonnel() {
        for (Person person : personnel) {
            System.out.println(person.displayInfo());
        }
    }
}
