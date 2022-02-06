import models.Motorcycles;
import models.Person;
import services.PersonServices;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        PersonServices personServices = new PersonServices();
        Person person = new Person("Vlad", 22);
        personServices.savePerson(person);
        Motorcycles suzuki = new Motorcycles("Suzuki" , "Blue");
        suzuki.setPerson(person);
        person.addMoto(suzuki);
        Motorcycles honda = new Motorcycles("Honda", "Green");
        honda.setPerson(person);
        person.addMoto(honda);
        personServices.updatePerson(person);
    }
}
