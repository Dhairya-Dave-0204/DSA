public class InheritanceExample {
    public static void main(String[] args) {
        Cat sphinx = new Cat();
        sphinx.eat(); // Inherited method from Animal class
        sphinx.meow(); // Method from Cat class
    }

    // Parent class
    public class Animal {
        String color;
        void eat() {
            System.out.println("eating...");
        }
    }

    // Child class
    public class Cat extends Animal {
        void meow() {
            System.out.println("meowing...");
        }
    }
}
