package generics;
//ArrrayList is a dynamic type of array which has predefined function or method to store and retrive the data of the array
//list is dynamic type of array which double its size everytime it fulls
// when u declare the List or other type of predefined structure in the java u must have to use the wrapper class instead of the primitive data type
import java.util.Arrays;

public class customArrayList {
    private  int [] data;
    private static int DEFAULT_VAlUE=10;
    //here size is working as the index value of the array
    private int size=0;

    public customArrayList(){
        this.data=new int[DEFAULT_VAlUE];
    }
    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;

    }
    public int size(){
        return size;
    }
    public boolean isfull(){
        return size==data.length;

        }
        public void resize(){
        int [] temp=new int[data.length*2];
            //In this we also copy the data of previous array
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;

        }
        public int remove(){
            return data[--size];
        }

    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void set(int index, int value){
        data[index]=value;
        }



    public static void main(String[] args) {
        customArrayList obj=new customArrayList();
//        obj.add(5);
//        obj.add(4);
//        obj.add(3);
        for(int i=0;i<15;i++){
            obj.add(i);
        }
        System.out.println(obj);
    }
    }

