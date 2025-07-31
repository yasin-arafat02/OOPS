abstract class ridePayment{
    abstract void payment(double amount);
    void paymentConfirm(String location){
        System.out.printf("Ride to %s is confirmed\n",location);
    }
}
class nagadPayment extends ridePayment{
    void payment(double amount){
        System.out.printf("Paid %.2f Taka using Nagad\n",amount);
    }
}
class bkashPayment extends ridePayment{
    void payment (double amount){
        System.out.printf("Paid %.2f Taka using Nagad\n",amount);
    }
}
class CashPayemnt extends ridePayment{
    void payment (double amount){
        System.out.printf("Paid %.2f Taka using Nagad\n",amount);
    }
}
public class RideSharingPayment {
    public static void main(String[] args) {
        double amount = 350.00;
        String location = "Dhanmondi";
        ridePayment p;
        p = new nagadPayment();
        p.payment(amount);
        p.paymentConfirm(location);


    }
}
