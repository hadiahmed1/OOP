package Lecture1;

public class L1_wrapper {
    public static void main(String[] args) {
        Integer a=45;
        Integer b=5;
        swap(a, b);
        System.out.println(a+" "+b);//dosent swap as Integer is final
    }
    static void swap(Integer a,Integer b){
        Integer t=a;
        a=b;
        b=t;
    }
}
