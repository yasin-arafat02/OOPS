class cars{
    String name;
    String color;
    static int wheel = 4;
    public cars(String name, String color){
        this.name = name;
        this.color = color;
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        cars w1 = new cars("BMW", "white");

        System.out.println(w1.name);
        System.out.println(w1.color);
        System.out.println(w1.wheel);

    }
}
