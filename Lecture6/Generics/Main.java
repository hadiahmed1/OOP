package Lecture6.Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList arr=new CustomArrayList();
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(2);
        System.out.println(arr);
        System.out.println("*****************\nCustom Generic Arrray List");
        GenericCAL<Integer> gCal=new GenericCAL<>();
        gCal.add(5);
        gCal.add(8);
        gCal.add(2);
        gCal.add(9);
        gCal.add(4);
        gCal.add(3);
        gCal.add(9);
        gCal.add(1);
        gCal.add(7);
        gCal.add(3);
        gCal.add(6);
        System.out.println(gCal);
    }
}
