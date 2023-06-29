package Lecture2;
import static Lecture1.L1.greet;
public class L2 {
    public static void main(String[] args) {
        A obj= new A("Hadi");
        System.out.println(obj);
        greet();
    }
}
class A{
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj deleted");
    }
}