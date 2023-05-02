public class linkedlist {
    Node head;
    public class Node{
        String data;
        Node next;
        Node(String data ){
            this.data=data;
            this.next=null;
        }
    }
    public  void print(){
        if(head==null){
            System.out.println("Head is empty");
            return;
        }
        Node currnode =head;
        while(currnode!=null){
            System.out.print(currnode.data+" -> ");
            currnode =currnode.next;
        }
    }
    public void addlast(String data){
        Node newnode=new Node( data);
        if(head==null){
            head = newnode;
            return;

        }
        Node currnode =head;
        while(currnode.next!=null){
           currnode=currnode.next;

        }
        currnode.next= newnode;
    }
    public void addfirst(String data){
        Node newnode =new Node(data);
        if(head ==null){
            head= newnode;
            return ;
        }

        newnode.next=head;
        head=newnode;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        if(head.next==null){
            head=null;
        }
        Node secondlastnode=head;
        Node lastnode=head.next;
       while(lastnode.next!=null){
        lastnode =lastnode.next;
        secondlastnode =secondlastnode.next;
       }
       secondlastnode.next=null;
    }
    public static void main(String[] args) {
        linkedlist list =new linkedlist();
        list.addlast("I");
        list.addlast("am");
        
        list.addfirst("hiii");
        list.addlast("good");
        list.deletelast();
        list.print();
    }
}
