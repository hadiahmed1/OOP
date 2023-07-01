package Lecture6.Generics;
import java.util.Arrays;
public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){//creating initial array
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){//adding elements to the array
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){return size==data.length;}//checking wether the array is full or not
    private void resize(){//doubling the size of array
        int temp[]=new int[DEFAULT_SIZE*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int rem=data[--size];
        return rem;
    }
    public int get(int index){return data[index];}
    public int size(){return size;}
    public void set(int index, int val){data[index]=val;}
    @Override
    public String toString(){
        return "data="+Arrays.toString(data)+"\nSize="+size;
    }
}
