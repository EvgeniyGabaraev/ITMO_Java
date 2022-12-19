import Lesson6.Task1.BankEmployee;
import Lesson6.Task1.Client;
import Lesson6.Task1.Human;

public class Main {
    public static void main(String[] args) {
//        Human person1 = new Human("Tom", "Smith");
//
//        System.out.println(person1.getName());
//        System.out.println(person1.getSurname());
        Client client1 = new Client("John", "Pak", "Bank of America");
        BankEmployee employee1 = new BankEmployee("Mike", "Smith", "Goliaph");

        client1.getInfo();
        employee1.getInfo();
    }
}