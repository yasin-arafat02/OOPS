class Students{
    String name;
    int id;
    String Dept;
    Students(String name, int id, String Dept){
        this.name = name;
        this.id = id;
        this.Dept = Dept;
    }
    void Display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Dept: " + Dept);
    }
}
class RegularStudent extends Students{
    RegularStudent(String name, int id, String Dept){
        super(name, id, Dept);
    }
}
class ProjectStudents extends Students{
    ProjectStudents(String name, int id, String Dept){
        super(name, id, Dept);
    }
    void SubmitProject(String projectName){
        System.out.println("Project Name: " + projectName);
    }
}
public class StudentProject {
    public static void main(String[] args) {
        RegularStudent s1 = new RegularStudent("Shibloo", 288, "Goo Goo");
        ProjectStudents s2 = new ProjectStudents("James", 5, "Goo Goo");

        s1.Display();
        s2.Display();

        s2.SubmitProject("AI Robot");
    }
}
