package ru.mirea;

public class Journal implements Printable {
    private String name;

    String getName(){
        return name;
    }

    Journal(String name){
        this.name = name;
    }

    public void print() {
        System.out.printf("Журнал: %s\n", name);
    }
}
