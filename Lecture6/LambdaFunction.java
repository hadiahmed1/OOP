package Lecture6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        Consumer<Integer> l=(item)->System.out.println(item*2);
        arr.forEach(l);
        Operation sum=(a,b)->a+b;
        Operation prod=(a,b)->a*b;
        Operation diff=(a,b)->a-b;
        Operation div=(a,b)->a/b;
        Operation rem=(a,b)->a% b;
        LambdaFunction calc=new LambdaFunction();
        System.out.println(calc.operate(15, 4,sum));
        System.out.println(calc.operate(15, 4,diff));
        System.out.println(calc.operate(15, 4,prod));
        System.out.println(calc.operate(15, 4,div));
        System.out.println(calc.operate(15, 4,rem));
    }
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a,int b);
}