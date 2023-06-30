package Lecture5.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new CDPlayer();
    NiceCar(){
        engine=new PowerEngine();
    }
    NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upggradeEngine(Engine engine){
        this.engine=engine;
        System.out.println("Engine Upgraded to "+this.engine);
    }
}
