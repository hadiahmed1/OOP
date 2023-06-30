package Lecture5.Interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void start() {
        System.out.println("I like Start Engine like a Normal Car");
    }
    @Override
    public void stop() {
        System.out.println("I Stop Engine like a Normal Car");
    }
    @Override
    public void acc() {
        System.out.println("I Accelerate like a Normal Car");
    }
    @Override
    public void brake() {
        System.out.println("I Brake like a Normal Car");
    }
}
