package Lecture2.singletonClass;

public class Main {
    public static void main(String[] args) {
        //Singleton obj=new Singleton(); ->not possible->Singleton() is private
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
