class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal a : animals) {
            a.sound();  // Runtime e decide hobe konta call hobe
        }
    }
}
