class Humanns {
    String name = "Shibloo";
    void speak() {
        System.out.println(name + " can speak.");
    }
}

class Child extends Humanns {
    void play() {
        System.out.println(name + " loves to play football.");
    }
}

class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
}

class Carr extends Vehicle {
    void playMusic() {
        System.out.println("Playing music in the car...");
    }
}

class Employeee {
    String name = "Yasin";
    double salary = 25000;
    void work() {
        System.out.println(name + " is working. Salary: " + salary);
    }
}

class Programmer extends Employeee {
    void code() {
        System.out.println(name + " is coding in Java.");
    }
}

public class Human1 {
    public static void main(String[] args) {
        Child baby = new Child();
        baby.speak();
        baby.play();

        System.out.println();

        Carr myCar = new Carr();
        myCar.startEngine();
        myCar.playMusic();

        System.out.println();

        Programmer dev = new Programmer();
        dev.work();
        dev.code();
    }
}