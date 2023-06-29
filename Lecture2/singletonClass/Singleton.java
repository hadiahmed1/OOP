package Lecture2.singletonClass;

public class Singleton {
    private Singleton(){}//can't call constructor->cannot create instances
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){//create new ob if no obj exist
            instance=new Singleton();
        }
        return instance;//return old obj
    }
}
