import java.lang.*;
import java.util.*;

public class MethodOveriding {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.eat();
    }

}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}
