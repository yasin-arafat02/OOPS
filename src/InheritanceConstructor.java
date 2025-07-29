class ParentCon{
    ParentCon(){
        System.out.println("it's a ParentCon");
    }
}
class childCon extends ParentCon{
    childCon(){
        System.out.println("it's a childCon");
    }
}
public class InheritanceConstructor {
    public static void main(String[] args) {
        childCon c = new childCon();

    }
}
