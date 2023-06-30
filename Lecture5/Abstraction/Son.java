package Lecture5.Abstraction;

public class Son extends Parent{
    Son(int age){
        super(age);
    }
    @Override
    void carrer(String name) {
        System.out.println("Carre="+name);
    }
    @Override
    void partner(String name, int age) {
        System.out.println("Name="+name+"Age="+age);
    }
}
