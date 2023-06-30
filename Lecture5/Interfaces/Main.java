package Lecture5.Interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("CAR");
        Car car = new Car();
        car.start();
        car.stop();
        car.acc();
        car.brake();
        System.out.println("ENGINE:");
        Engine e=new Car();
        e.start();
        e.stop();
        System.out.println("MEDIA:");
        Media m=new Car();
        m.start();
        m.stop();
        System.out.println("****************\nNice Car\n");
        NiceCar nc=new NiceCar();
        nc.start();
        nc.startMusic();
        nc.upggradeEngine(new ElectricEngine());
        nc.start();
    }
}
