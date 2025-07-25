class Book{
    String title;
    String author;
    double price;

    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double Discount(double discount){
        return price - (price * discount / 100);
    }
    public void Display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Discount Price : "+Discount(10));
    }


}
public class BookManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Book 1","Shibloo",780);
        Book b2 = new Book("Book 2","Mahmuda",880);

        b1.Display();
        b2.Display();
    }
}
