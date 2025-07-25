public class Student {
    String name;
    int age;
    Pen pen; // Student has a Pen

    public void writeWithPen() {
        System.out.println(name + " is writing with pen.");
        pen.write();
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        pen.printInfo();
    }
}