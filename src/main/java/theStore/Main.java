package theStore;
/*
lägga till någram kunder arbetare etc. OK

välja om du är kund/arbetare/chef -> vem är du ( välj namn) -> gå in i affären i olika delar

olika options: sitt i kassa, plocka varor, anställ någon , sparka någon.
*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Person> PeopleList = new ArrayList<>();

        Customer customer = new Customer("Adam", 34);
        Customer customer1 = new Customer("Bert", 35);
        Customer customer2 = new Customer("Carl", 36);
        Customer customer3 = new Customer("Dennis", 37);

        Employee employee = new Employee("Anki", 34);
        Employee employee1 = new Employee("Bosse", 36);
        Employee employee2 = new Employee("Cecilia", 33);
        Employee employee3 = new Employee("Donatello", 31);

        PeopleList.add(new Customer("AdamLista", 44));
        PeopleList.add(new Cashier("SimonLista", 44));
        PeopleList.add(new Administrator("MaikenLista", 44));

    }
}