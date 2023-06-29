package Inheritence;

public class BoxPrice extends BoxWeight{
    double p;
    BoxPrice(){
        super();
        this.p=-1;
    }
    BoxPrice(double l,double b,double h,double w,double p){
        super(l,b,h,w);
        this.p=p;
    }
}
