package stack;

public class customstack {
    public int data[];
    private static final int DEFAULT_SIZE=10;
    int prt=-1;
    public customstack(){
        this(DEFAULT_SIZE);
    }
    public customstack(int size){
        this.data=new int [size];

    }
    public boolean push(int item){
        if(isfull()){
            System.out.println("Stack Overfull");
            return false;
        }
        prt++;
        data[prt]=item;
        return true;
    }

    public  boolean isfull() {
        return prt==data.length-1;
    }
    private boolean isEmpty(){
        return prt==-1;
    }
    public int pop() throws stackException{
        if(isEmpty()){
            throw new stackException("Stack is Empty ");

        }
        int removed=data[prt];
        prt--;
        return removed;
    }
    public int peak() throws stackException {
        if(isEmpty()){
            throw new stackException("Stack is Empty ");

        }
        return data[prt];
    }
}
