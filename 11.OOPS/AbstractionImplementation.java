public class AbstractionImplementation {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();
        System.out.println("Horse color: " + horse.color);
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    abstract void walk();
    String color;
    Animal() {
        color = "Brown";
    }
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse is walking");
    }

    void changeColor() {
        color = "black";
    }
}