class Human{
    private String name = "Yasin Arafat Shibloo";
    private int age = 22;

    public String getName(){
        return name;
    }
    public int getAge (){
        return age;
    }
//--------Getter Function-------//
}
public class EncapsulationBasic {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getName());
        System.out.println(human.getAge());
    }
}