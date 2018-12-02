package ru.mirea;

class Planet implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    Planet(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.printf("Планета: %s\n", name);
    }
}
