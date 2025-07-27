class MathUtility{
    public static int add(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
public class StaticMethodTask {
    public static void main(String[] args) {
        System.out.println(MathUtility.add(10,5));
        System.out.println(MathUtility.multiply(10,5));
        System.out.println("Is 10 Even? "+MathUtility.isEven(10));
    }
}
