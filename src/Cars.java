class Car{
    String name;
    String brand;
    String color;
    Double price;

    public Car(String name, String Brand,String color,double price){
        this.name = name;
        this.brand = Brand;
        this.color = color;
        this.price = price;
    }
    double Discount(double discount){
        return price - (price * discount / 100);
    }
    void Display(double d){
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.printf("Price: %.0f\n",price);
        System.out.printf("Discount: %.0f\n",Discount(d));
    }
}

public class Cars {
    public static void main(String[] args) {
        Car c1 = new Car("X7","BMW","RED",20000000);
        Car c2 = new Car("Crown","Toyota","Black",18000000);

        c1.Display(9.99);
        System.out.println();
        c2.Display(5.55);
    }
}
