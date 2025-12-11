// Parent Class
class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

// Dog Class (Child)
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat Class (Child)
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.sound(); // Some generic sound
        dog.sound();    // Dog barks
        cat.sound();    // Cat meows
    }
}

