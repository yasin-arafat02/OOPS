class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class StudentD1 extends person{
    int StuID;
    String StudentDept;
    StudentD1(String name,int age,int StuID,String StudentDept){
        super(name,age);
        this.StuID=StuID;
        this.StudentDept=StudentDept;
    }
    void show(){
        super.show();
        System.out.println("StudentID: " + StuID);
        System.out.println("StudentDept: " + StudentDept);
    }
}
public class StudentUniversitySystem {
    public static void main(String[] args) {
        StudentD1 s1 = new StudentD1("Yaisn",18,288,"CSE");
        s1.show();
    }
}
