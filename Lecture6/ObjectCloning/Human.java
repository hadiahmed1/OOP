package Lecture6.ObjectCloning;

import javax.security.auth.callback.TextInputCallback;

public class Human implements Cloneable{
    int age;
    String name;
    int arr[];
    Human(String name,int age){
        this.name=name;
        this.age=age;
        this.arr=new int[]{1,2,3,4,5};
    }
    // @Override//shallow
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }
    @Override//DEEP
    public Object clone() throws CloneNotSupportedException{
        Human twin=(Human) super.clone();//shallow
        twin.arr=new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
