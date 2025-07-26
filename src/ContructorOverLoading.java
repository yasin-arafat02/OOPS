class StudentDetails {
    String name;
    int age;

    public StudentDetails() {
        this.name = "Unknown";
        this.age= 0;
    }

    public StudentDetails(String name){
        this.name = name;
    }

    public StudentDetails(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public void Display(){
        System.out.println(this.name + " is " + this.age + " years old.");
    }


}

public class ContructorOverLoading {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails("John");
        StudentDetails s3 = new StudentDetails("Jane",18);

        s1.Display();
        s2.Display();
        s3.Display();
    }
}
