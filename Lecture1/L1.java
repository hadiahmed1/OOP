//create a data type to store name, roll, marks
package Lecture1;
public class L1{
    public static void main(String[] args) {
        Student s1=new Student("Hadi orignal",57,8.9f);
        //object -> instance of a class
        //"new"->dynamically alocates memory and returns a refrence to it
        //Student() ->constructor->special function ->defines what happens when obj is created
        //in java all class obj must be alocated dynamically
        s1.greet();
        Student s_ref=s1;//creating refrence variable that points to same place as s1
        s_ref.name="Hadi(changed via refrence variable)";
        System.out.println(s1);
        Student s2=new Student();
        System.out.println(s2);
        Student s3=new Student(s1);
        //finalize called when lot of obects->grabage collector is called
        for(int i=0;i<209000;i++){
            s3=new Student();
        }
        System.out.println(s3);
    }
    public static void greet(){
        System.out.println("My name is Hadi");
    }    
}
class Student{//class -> logical construct || rules to make an object
    String name;
    int roll;
    float marks;
    void greet(){
        System.out.println("My name is "+this.name);
    }
    //making constructor
    Student(String name, int rno, float marks){
        //this-> replaced with refrence variable
        this.name=name;
        this.roll=rno;
        this.marks=marks;
    }
    //constructor overloading -> same name, diffrent parameters
    Student(){
        //callin constructor from constructor
        //Internally: Student("default", 99, 99.9f);
        this("default", 99, 99.9f);
    }
    Student(Student s){//passing obj as parameter
        this.name=s.name;
        this.roll=s.roll;
        this.marks=s.marks;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
    @Override
    public String toString() {
        String str=this.name+", "+this.roll+", "+this.marks;
        return str;
    }
}