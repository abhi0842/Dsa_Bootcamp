package Queues;

public class circularqueue {
    private static int data[];
    private static final int DEFAULT_SIZE=10;
    int end=0;
    int first=0;
    int size=0;
    public circularqueue(){
        this(DEFAULT_SIZE);
    }
    public circularqueue(int size){
        this.data=new int[size];
    }
    public  boolean isFull(){
        //this mean that the length end reaches the end of the array
        return end==data.length-1;
    }
    public  boolean isEmpty(){
        return end ==-1;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed=data[first++];
        first=first%data.length;
        size--;
    return removed;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }


       int i=first;
       do {
           System.out.print(data[i]+" ");
           i++;
           i  %= data.length;


       }while (i != end);
               System.out.println("end ");

        }
}
