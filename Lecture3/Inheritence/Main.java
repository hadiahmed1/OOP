package Inheritence;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Box b1=new Box();
        // Box.information(b1);
        // Box b2=new Box(5,6,7);
        // Box.information(b2);
        // Box b3=new Box(7);
        // Box.information(b3);

        BoxWeight bw= new BoxWeight();
        System.out.println(bw.b);
        Box b5=new BoxWeight(5,7,4,6);
        System.out.println(b5.l);
        //System.out.println(b5.w); //can't acess. acess depends on refrence variable type not obj 
    }
}
