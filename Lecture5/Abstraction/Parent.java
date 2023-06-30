package Lecture5.Abstraction;

public abstract class  Parent {
    int age;
    Parent(int age){
        this.age=age;
    }
    abstract void carrer(String name);
    abstract void partner(String name, int age);
}
