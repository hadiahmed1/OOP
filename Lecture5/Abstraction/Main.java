package Lecture5.Abstraction;

public abstract class Main {
    public static void main(String[] args) {
        Son s=new Son(20);
        Daughter d= new Daughter(321);
        s.carrer("Engineer");
        s.partner("Ann",21);
        d.carrer("Doc");
    }
}
