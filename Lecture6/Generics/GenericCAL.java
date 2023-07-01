package Lecture6.Generics;
import java.util.Arrays;
public class GenericCAL<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public GenericCAL(){//creating initial array
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){//adding elements to the array
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){return size==data.length;}//checking wether the array is full or not
    private void resize(){//doubling the size of array
        Object temp[]=new Object[DEFAULT_SIZE*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T rem=(T)(data[--size]);
        return rem;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T val){data[index]=val;}
    @Override
    public String toString(){
        return "data="+Arrays.toString(data)+"\nSize="+size;
    }
}
