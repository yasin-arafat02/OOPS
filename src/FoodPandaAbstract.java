abstract class FoodPayment{
    abstract void pay(double amount);
    void ConfirmOrder(String food){
        System.out.printf("Order Confirmed for: %s\n", food);
    }
}
class MobilePay extends FoodPayment{
    void pay(double amount){
        System.out.printf("Pay tk using %.2f mobile banking.\n",amount);
    }
}
class AppleBanking extends FoodPayment{
    void pay(double amount){
        System.out.printf("Pay tk using %.2f apple banking.\n",amount);
    }
}
class CashOnDelivery extends FoodPayment{
    void pay(double amount){
        System.out.printf("Pay tk using %.2f cash on delivery.\n",amount);
    }
}
public class FoodPandaAbstract {
    public static void main(String[] args) {
        String food  = "Chees Burger";
        Double price = 350.00;
        FoodPayment f;
        f = new MobilePay();
        f.pay(price);
        f.ConfirmOrder(food);

        f= new CashOnDelivery();
        f.pay(price);
        f.ConfirmOrder(food);
    }
}
