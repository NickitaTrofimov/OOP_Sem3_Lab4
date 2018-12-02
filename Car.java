package ru.mirea;

class Car implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    Car(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Машина: %s", name);
    }
}
