public class Main {
    public static void main(String[] args) {
        // Create a Pen
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.brand = "Parker";

        // Create a Student
        Student s1 = new Student();
        s1.name = "Yasin Arafat Shibloo";
        s1.age = 22;
        s1.pen = p1;

        // Student actions
        s1.printDetails();
        s1.writeWithPen();
    }
}