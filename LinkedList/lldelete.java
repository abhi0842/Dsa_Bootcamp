public class lldelete {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("list.emity");
            return;
        }
        head =head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        Node secondlastnode=head;
        Node lastnode=head.next;
       while(lastnode!=null){
        lastnode =lastnode.next;
        secondlastnode =secondlastnode.next;
       }
       secondlastnode.next=null;
    }
    public static void main(String[] args) {
        lldelete list= new list();
       l
    }
}
