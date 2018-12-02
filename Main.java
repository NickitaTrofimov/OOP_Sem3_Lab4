package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String name_book = in.nextLine();
        Printable printable = new Book(name_book);
        //printable.print();
        ((Book) printable).getName();

        System.out.print("Введите название журнала: ");
        String name_journal = in.nextLine();
        printable = new Journal(name_journal);
        printable.print();
        ((Journal) printable).getName();

        System.out.print("Введите название планеты: ");
        String name_planet = in.nextLine();
        printable = new Planet(name_planet);
        printable.print();

        System.out.print("Введите название машины: ");
        String name_car = in.nextLine();
        printable = new Car(name_car);
        printable.print();
    }
}
