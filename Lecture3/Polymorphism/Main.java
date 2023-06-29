package Polymorphism;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Shape s= new Shape();
        Circle c = new Circle();
        Shape sq= new Square();//calls square.area not shape.area. Refrence variable is Shape. WHY?
        //Parent obj=new Child();
        //OVERRIDING->When obj and ref var diffrent. Which version of method is called depends on obj(UpCasting)
        //JAVA determines this by dynamic method dispatch
        s.area();
        c.area();
        sq.area();
    }
}