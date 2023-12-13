package Queues;

public class customqueue {
    private static int data[];
    private static final int DEFAULT_SIZE=10;
     int end=0;
    public customqueue(){
        this(DEFAULT_SIZE);
    }
    public customqueue(int size){
        this.data=new int[size];
    }
    public  boolean isFull(){
        //this mean that the length end reaches the end of the array
        return end==data.length-1;
    }
    public  boolean isEmpty(){
        return end ==-1;
    }
public  boolean insert(int item){
        if(isFull()){

            return false;
         }
        data[end]=item;
        end++;
        return true;
}
public  int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove =data[0];
    //shift the elements to the left
    for(int i=1;i<data.length-1;i++){
        data[i-1]=data[i];

    }
    end--;
    return remove;
}
public void display() {
       for(int i=0;i<data.length;i++){
           System.out.print(data[i]+" ");
       }
        System.out.print("END OF THE QUEUE(");
}

}

