abstract class Payment{
    abstract void pay();
    void confirmOrder(){
        System.out.println("Your Order is Confirm!");
    }
}
class mobilebanking extends Payment{
    void pay(){
        System.out.println("Paying using Mobile Banking (bKash/Nagad).");
    }
}
class cardbanking extends Payment{
    void pay(){
        System.out.println("Visa card or Mastercard Banking");
    }
}
class cashonbanking extends Payment{
    void pay(){
        System.out.println("Cash On Delivery");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Payment p ;

        p = new mobilebanking();
        p.pay();
        p.confirmOrder();

        p = new cardbanking();
        p.pay();
        p.confirmOrder();

        p = new cashonbanking();
        p.pay();
        p.confirmOrder();
    }
}
