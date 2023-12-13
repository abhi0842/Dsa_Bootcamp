package Queues;

public class Main {
    public static void main(String[] args) throws Exception {
        circularqueue queue=new circularqueue();
        queue.insert(13);
        queue.insert(12);
        queue.insert(11);
        queue.insert(11);
        queue.insert(10);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(1344);
        queue.display();



    }
}
