interface flyable{
    void fly();
}
interface swimable{
    void swim();
}
class bird implements flyable{
    public void fly(){
        System.out.println("Brid is flyying");
    }
}
class fish implements swimable{
    public void swim(){
        System.out.println("FIsh is swiming");
    }
}
class duck implements flyable,swimable{
    public void fly(){
        System.out.println("Duck is flying");
    }
    public void swim(){
        System.out.println("Duck is swiming");
    }
}
public class InterfaceTufDemo {
    public static void main(String[] args) {
        flyable f;
        swimable s;
        duck d;

        f = new bird();
        f.fly();

        s = new fish();
        s.swim();

        d =  new duck();
        d.fly();
        d.swim();

    }
}
