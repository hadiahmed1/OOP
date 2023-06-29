package Inheritence;

public class Box {
    double l,b,h;
    
    Box(){
        this.l=this.b=this.h=-1;
    }
    Box(double side){//cube
        this.b=this.h=this.l=side;
    }
    Box(double l,double b,double h){//cuboid
            this.l=l;
        this.b=b;
        this.h=h;
    }
    Box (Box old){
        this.l=old.l;
        this.b=old.b;
        this.h=old.h;       
    }
    public static void information(Box b){
        System.out.println("l="+b.l);        
        System.out.println("b="+b.b);
        System.out.println("h="+b.h);
    }
}
