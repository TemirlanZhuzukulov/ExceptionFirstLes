package Practica2911;

import java.time.LocalDate;
import java.util.Scanner;

public class Customer implements Serviceable {
    private String name;
    private String surname;
    private Country bornCountry;
    private LocalDate dateOfBorn;
    private String gmail;

    public Customer(String name, String surname, Country bornCountry, LocalDate dateOfBorn, String gmail) {
        this.name = name;
        this.surname = surname;
        this.bornCountry = bornCountry;
        this.dateOfBorn = dateOfBorn;
        this.gmail = gmail;

    }

    public Customer() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country getBornCountry() {
        return bornCountry;
    }

    public void setBornCountry(Country bornCountry) {
        this.bornCountry = bornCountry;
    }

    public LocalDate getDateOfBorn() {
        return dateOfBorn;
    }

    public void setDateOfBorn(LocalDate dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornCountry=" + bornCountry +
                ", dateOfBorn=" + dateOfBorn +
                ", gmail='" + gmail + '\'' +
                '}';
    }

    @Override
    public LocalDate getAge() {
        return null;
    }

    @Override
    public Customer[] getStudentSameCountry(Customer[] customers) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String word = scanner.nextLine();
        for (Customer c : customers) {
            if (word.equals(c.getBornCountry().name())) {
                counter++;
            }
        }


    }
}


//    @Override
//    public Country[] arrraysCountry(Customer[] customers) {
//        return new Country[0];
////    }
//
//    @Override
//    public Customer[] CUSTOMERS(Customer[] customers) {
//        return new Customer[0];
//    }
//}

