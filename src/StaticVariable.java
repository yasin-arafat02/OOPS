class Carss{
    String name;
    String color;
    static int wheel = 4;
    public Carss(String name, String color){
        this.name = name;
        this.color = color;
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Carss w1 = new Carss("BMW", "white");

        System.out.println(w1.name);
        System.out.println(w1.color);
        System.out.println(w1.wheel);

    }
}
