package Lecture6.ObjectCloning;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human hadi=new Human("Hadi",20);
        //Human twin=new Human(hadi);
        Human twin=(Human)hadi.clone();
        twin.arr[0]=100;
        twin.name="TWIN";
        twin.age=50;
        System.out.println(hadi.name+" "+hadi.age);
        System.out.println(Arrays.toString(hadi.arr));
        System.out.println(twin.name+" "+twin.age);
        System.out.println(Arrays.toString(twin.arr));
    }
}
