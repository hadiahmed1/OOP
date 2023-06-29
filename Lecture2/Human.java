package Lecture2;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static int population;//use static for attributes common to all objects. Belong to class, not object specific
    Human(String name,int age,int salary,boolean married){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }
}
