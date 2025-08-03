interface Paymentjo{
    void pay(double amount);
}
class bkash implements Paymentjo{
    public void pay(double amount){
        System.out.println("Paid " +amount+ " using bkash");
    }
}
class nagad implements Paymentjo{
    public void pay(double amount){
        System.out.println("Paid " +amount+ " using nagad");
    }
}
public class InterfaceInJAVA {
    public static void main(String [] args){
        Paymentjo p ;

        p = new bkash();
        p.pay(800);

        p = new nagad();
        p.pay(990);

    }
}
