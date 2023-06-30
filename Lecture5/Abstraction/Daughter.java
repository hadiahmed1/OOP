package Lecture5.Abstraction;

public class Daughter extends Parent{
    Daughter(int age){
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

