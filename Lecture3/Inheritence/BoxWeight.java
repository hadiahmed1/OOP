package Inheritence;

public class BoxWeight extends Box{
    double w;
    public BoxWeight(){
        super();
        this.w=-1;
    }
    public BoxWeight(double l,double b,double h,double w){
        super(l,b,h);//calling parent class constructor
        this.w=w;
    }

}