package Lecture6.ComparingObjects;

public class Student implements Comparable<Student>{
    String name;
    float marks;
    Student(String name, float marks){
        this.name=name;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student arg0) {
        return (int)(this.marks-arg0.marks);
    }
    @Override
    public String toString() {
        return this.marks+"";
    }
}
