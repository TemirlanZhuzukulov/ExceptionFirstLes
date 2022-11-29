package Practica2911;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Customer [] customers= {
                new Customer("Asan", "Uson", Country.KYRGYZSTAN, LocalDate.of(2002, 10, 14), "a.asan"),
                new Customer("Uson", "Uson", Country.KYRGYZSTAN, LocalDate.of(2002, 10, 14), "a.asan"),
                new Customer("Aktan", "Uson", Country.KYRGYZSTAN, LocalDate.of(2002, 10, 14), "a.asan"),
                new Customer("Aibek", "Uson", Country.KYRGYZSTAN, LocalDate.of(2002, 10, 14), "a.asan")
        };
        Customer customer =new Customer();
        System.out.println(Arrays.toString(customer.getStudentSameCountry(customers)));

    }
}
