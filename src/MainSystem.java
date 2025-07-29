class PersonProfile {
    String name = "Shibloo";
    void introduce() {
        System.out.println(name + " can introduce himself.");
    }
}

class Gamer extends PersonProfile {
    void playGame() {
        System.out.println(name + " loves to play Valorant.");
    }
}

class Machine {
    void startSystem() {
        System.out.println("System booted.");
    }
}

class Robot extends Machine {
    void speakAI() {
        System.out.println("Robot is speaking with AI voice...");
    }
}

class Worker {
    String name = "Yasin";
    double salary = 30000;
    void performTask() {
        System.out.println(name + " is working on a project. Salary: " + salary);
    }
}

class Developer extends Worker {
    void writeCode() {
        System.out.println(name + " is writing Java code.");
    }
}

public class MainSystem {
    public static void main(String[] args) {
        Gamer player = new Gamer();
        player.introduce();
        player.playGame();

        System.out.println();

        Robot bot = new Robot();
        bot.startSystem();
        bot.speakAI();

        System.out.println();

        Developer coder = new Developer();
        coder.performTask();
        coder.writeCode();
    }
}