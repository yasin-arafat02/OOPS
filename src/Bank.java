class Details{
    private String name;
    private int id;
    private double balance;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void Deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited " + amount + " to " + name);
        }
        else {
            System.out.println("Set only Positive Number");
        }
    }
    public void Withdraw(double amount){
        if(amount>0){
            balance-=amount;
            System.out.println("Withdrawn " + amount + " to " + name);
        }
        else{
            System.out.println("Set only Positive Number");
        }
    }

}
public class Bank {
    public static void main(String[] args) {
        Details user = new Details();

        user.setName("Yasin Arafat Shibloo");
        user.setID(1234567890);
        user.Deposit(10000);
        user.Withdraw(999);

        System.out.println("Name : "+user.getName());
        System.out.println("ID : "+user.getID());
        System.out.println("Balance : "+user.getBalance());

    }
}
