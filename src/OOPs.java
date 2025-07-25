class car{
    String name;
    String color;
    String Model;

    public void Displayname(){
        System.out.println("Name: " + name);
    }
    public void Displaycolor(){
        System.out.println("Color: " + color);
    }
    public void DisplayModel(){
        System.out.println("Model: " + Model);
    }
}
public class OOPs {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        c1.name = "BMW";
        c1.color = "red";
        c1.Model = "X7";

        c2.name = "Toyota";
        c2.color = "Black";
        c2.Model = "Crown";

        c1.Displaycolor();
        c1.DisplayModel();
        c1.Displayname();

        c2.Displaycolor();
        c2.DisplayModel();
        c2.Displayname();
    }
}
