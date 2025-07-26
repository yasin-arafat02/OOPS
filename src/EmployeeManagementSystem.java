class Employee{
    String name;
    int id;
    double salary;

    public Employee(){
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0;
    }
    public Employee(String name,int id){
        this.name = name;
        this.id = id;
        this.salary = 0;
    }
    public Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.printf("Name : %s ,: ID : %d ,Salary : %.2f\n",name,id,salary);
    }
    double getSalary(double percentage){
       return salary = salary + (salary * percentage / 100);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[]args){
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alex",101);
        Employee e3 = new Employee("john",102,50000.0);

        e1.display();
        e2.display();
        e3.display();

        double NewSalary = e3.getSalary(10);

        System.out.println("After 10% Raise to John:");
        System.out.println("New Salary : "+NewSalary);

    }
}
