class Parent{
    void show1(){
        System.out.println("I'm a parent Class.");
    }
}
class child extends Parent{
    void show(){
        System.out.println("I'm a child class.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        child c1 = new child();
        c1.show();
        c1.show1();
    }
}
