package Lecture4.AcessControl;

/**
 * A
 */
public class A {
    private int num;
    String name;
    int[] arr;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public A(){System.out.println("IN L4.AC.A");}
    public A(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
}