package Lecture6.ComparingObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student hadi=new Student("hadi", 8.91f);
        Student mah=new Student("mah", 9.87f);
        Student s1=new Student("s1", 7.91f);
        Student s2=new Student("s2", 9.37f);
        Student s3=new Student("s3", 8.51f);
        Student s4=new Student("s4", 6.7f);
        Student[] list={hadi,mah,s1,s2,s3,s4};
        System.out.println("Before Sort:"+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("After Sort:"+Arrays.toString(list));
        if(hadi.compareTo(mah)>0){
            System.out.println("hadi>mah");
        }else{
            System.out.println("mah>hadi");
        }
    }
}
